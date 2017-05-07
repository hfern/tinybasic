package com.hfernandes.tinybasic.runtime;

import com.hfernandes.tinybasic.generated.TinyBasicLexer;
import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.runtime.evaluators.*;
import com.hfernandes.tinybasic.runtime.exceptions.GrammarViolatedException;
import com.hfernandes.tinybasic.runtime.exceptions.TinyBasicException;
import com.hfernandes.tinybasic.runtime.utils.TokenRecognizer;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;

public class ProgramEvaluator {
    public ProgramState state;

    public TinyBasicParser.ProgramContext programContext;
    public ArrayList<TinyBasicParser.StatementContext> statementLines;

    protected HashMap<Integer, Evaluator> statementHandlers;

    public ProgramEvaluator(ProgramState state) {
        this.state = state;

        statementHandlers = new HashMap<>();
        statementHandlers.put(TinyBasicLexer.PRINT, setPE(new PrintEvaluator()));
        statementHandlers.put(TinyBasicLexer.IF, setPE(new IfEvaluator()));
        statementHandlers.put(TinyBasicLexer.GOTO, setPE(new GotoEvaluator()));
        statementHandlers.put(TinyBasicLexer.INPUT, setPE(new InputEvaluator()));
        statementHandlers.put(TinyBasicLexer.LET, setPE(new LetEvaluator()));
        statementHandlers.put(TinyBasicLexer.GOSUB, setPE(new GosubEvaluator()));
        statementHandlers.put(TinyBasicLexer.RETURN, setPE(new ReturnEvaluator()));
        statementHandlers.put(TinyBasicLexer.CLEAR, setPE(new ClearEvaluator()));
        statementHandlers.put(TinyBasicLexer.LIST, setPE(new ListEvaluator()));        statementHandlers.put(TinyBasicLexer.RUN, setPE(new RunEvaluator()));
        statementHandlers.put(TinyBasicLexer.END, setPE(new EndEvaluator()));
    }

    public void setProgram(TinyBasicParser.ProgramContext programContext) {
        this.programContext = programContext;
        statementLines = new ArrayList<TinyBasicParser.StatementContext>();
        for (int i = 0; i < programContext.getChildCount(); i++) {
            TinyBasicParser.LineContext line = (TinyBasicParser.LineContext) programContext.getChild(i);

            if (line.getChildCount() > 0 && line.getChild(0) instanceof TinyBasicParser.NumberContext) {
                TinyBasicParser.StatementContext statement = (TinyBasicParser.StatementContext) line.getChild(1);
                TinyBasicParser.NumberContext lineNumberNode = (TinyBasicParser.NumberContext) line.getChild(0);
                statementLines.add(statement);
                state.lineMap.put(lineNumberNode.getText(), statementLines.size() - 1);
            } else {
                TinyBasicParser.StatementContext statement = (TinyBasicParser.StatementContext) line.getChild(0);
                statementLines.add(statement);
            }
        }
    }

    // Evaluate the next line, specified by state.pc
    // returns true while the program has not terminated
    public boolean step() throws TinyBasicException {
        if (state.pc >= statementLines.size()) {
            return false; // program done :)
        }

        state.pc++;
        TinyBasicParser.StatementContext stmtToRun = statementLines.get(state.pc - 1);

        try {
            return runStatement(stmtToRun);
        } catch (TinyBasicException e) {
            //TODO(hunter): Attach statement context info to the exception here!
            // This can help users figure out why their program crashed.
            throw e;
        }
    }

    public boolean runStatement(TinyBasicParser.StatementContext stmt) throws TinyBasicException {
        if (!(stmt.getChild(0) instanceof TerminalNode)) {
            throw new RuntimeException("Critical: Statement expected first item to be stmt type token, is not!");
        }

        TerminalNode exprType = ((TerminalNode) stmt.getChild(0));

        if (!TokenRecognizer.isTerminal(exprType)) {
            throw new GrammarViolatedException();
        }

        Evaluator handler = statementHandlers.get(TokenRecognizer.getTerminalType(exprType));

        if (handler == null) {
            throw new TinyBasicException("I have not implemented handler for " + exprType.getText());
        }

        return handler.evaluate(stmt);
    }

    // Get an array of expressions from an expr list
    static ArrayList<TinyBasicParser.ExpressionContext> filterExprList(TinyBasicParser.ExprlistContext exprList) {
        ArrayList<TinyBasicParser.ExpressionContext> list = new ArrayList<TinyBasicParser.ExpressionContext>();

        for (int i = 0; i < exprList.getChildCount(); i++) {
            if (exprList.getChild(i) instanceof TinyBasicParser.ExpressionContext) {
                list.add((TinyBasicParser.ExpressionContext) exprList.getChild(i));
            }
        }

        return list;
    }

    private Evaluator setPE(Evaluator evaler) {
        evaler.setProgramEvaluator(this);
        return evaler;
    }
}

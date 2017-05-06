package com.hfernandes.tinybasic.runtime;

import com.hfernandes.tinybasic.generated.TinyBasicLexer;
import com.hfernandes.tinybasic.generated.TinyBasicParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;

public class ProgramEvaluator {
    public ProgramState state;

    public ArrayList<TinyBasicParser.StatementContext> statementLines;

    public ProgramEvaluator(ProgramState state) {
        this.state = state;
    }

    public void setProgram(TinyBasicParser.ProgramContext programContext) {
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
    public boolean step() {
        if (state.pc >= statementLines.size()) {
            return false; // program done :)
        }

        state.pc++;
        return runStatement(state.pc - 1);
    }

    protected boolean runStatement(Integer statementId) {
        TinyBasicParser.StatementContext stmt = statementLines.get(statementId);
        System.out.println("Running statement " + statementId);

        if (!(stmt.getChild(0) instanceof TerminalNode)) {
            throw new RuntimeException("Critical: Statement expected first item to be stmt type token, is not!");
        }

        TerminalNode exprType = ((TerminalNode) stmt.getChild(0));

        if (terminalIs(exprType, TinyBasicLexer.PRINT)) {

        }

        return true;
    }

    static boolean terminalIs(TerminalNode node, int tokenType)
    {
        return node.getSymbol().getType() == tokenType;
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
}

package com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicLexer;
import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.generated.TinyBasicParser.ExpressionContext;
import com.hfernandes.tinybasic.generated.TinyBasicParser.StatementContext;
import com.hfernandes.tinybasic.runtime.exceptions.GrammarViolatedException;
import com.hfernandes.tinybasic.runtime.exceptions.TinyBasicException;
import com.hfernandes.tinybasic.runtime.utils.TokenRecognizer;
import com.hfernandes.tinybasic.runtime.vals.Value;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Tree;

public class IfEvaluator extends Evaluator {
    @Override
    public boolean evaluate(StatementContext statement) throws TinyBasicException {
        Value left = ExprEvaluator.evaluate(pe.state, (ExpressionContext) statement.getChild(1));
        Value right = ExprEvaluator.evaluate(pe.state, (ExpressionContext) statement.getChild(3));
        String op = ((TerminalNode) statement.getChild(2)).getText();

        if (!evalRelop(left, op, right)) {
            return true;
        }

        StatementContext thenStatement = (StatementContext) statement.getChild(5);
        pe.runStatement(thenStatement);

        if (TokenRecognizer.terminalIs(thenStatement.getChild(0), TinyBasicLexer.GOSUB)) {
            Integer nextPC = pe.state.retStack.pop();
            nextPC--;
            pe.state.retStack.push(nextPC);
        }

        return true;
    }

    public static boolean evalRelop(Value left, String op, Value right) throws GrammarViolatedException {
        switch (op) {
            case "<":
                return left.val < right.val;
            case ">":
                return left.val > right.val;
            case "<=":
                return left.val <= right.val;
            case ">=":
                return left.val >= right.val;
            case "<>":
                return !left.val.equals(right.val);
            case "><":
                return !left.val.equals(right.val);
            case "=":
                return left.val.equals(right.val);
        }
        throw new GrammarViolatedException();
    }
}

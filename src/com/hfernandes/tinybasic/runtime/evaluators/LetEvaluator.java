package com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.generated.TinyBasicParser.ExpressionContext;
import com.hfernandes.tinybasic.runtime.exceptions.TinyBasicException;
import org.antlr.v4.runtime.tree.TerminalNode;

public class LetEvaluator extends Evaluator {
    @Override
    public boolean evaluate(TinyBasicParser.StatementContext statement) throws TinyBasicException {
        TerminalNode varName = (TerminalNode) statement.getChild(1);
        ExpressionContext expr = (ExpressionContext) statement.getChild(3);
        pe.state.varMap.put(varName.getText(), ExprEvaluator.evaluate(pe.state, expr));
        return true;
    }
}

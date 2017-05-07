package com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.generated.TinyBasicParser.ExpressionContext;
import com.hfernandes.tinybasic.runtime.exceptions.BadGotoException;
import com.hfernandes.tinybasic.runtime.exceptions.TinyBasicException;
import com.hfernandes.tinybasic.runtime.vals.Value;

public class GotoEvaluator extends Evaluator {
    @Override
    public boolean evaluate(TinyBasicParser.StatementContext statement) throws TinyBasicException {
        Value val = ExprEvaluator.evaluate(pe.state, (ExpressionContext) statement.getChild(1));
        Integer lineNumber = pe.state.lineMap.get("" + val.val);

        if (lineNumber == null) {
            throw new BadGotoException(val);
        }

        pe.state.pc = lineNumber;
        return true;
    }
}

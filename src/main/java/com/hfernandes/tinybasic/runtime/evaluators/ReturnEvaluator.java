package com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.runtime.exceptions.TinyBasicException;

public class ReturnEvaluator extends Evaluator {
    @Override
    public boolean evaluate(TinyBasicParser.StatementContext statement) throws TinyBasicException {
        if (pe.state.retStack.size() == 0) {
            throw new TinyBasicException("Tried to RETURN but no ret location available!");
        }

        pe.state.pc = pe.state.retStack.pop();
        return true;
    }
}

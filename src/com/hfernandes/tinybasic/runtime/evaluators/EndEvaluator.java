package com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.runtime.exceptions.StopExecutionException;
import com.hfernandes.tinybasic.runtime.exceptions.TinyBasicException;

public class EndEvaluator extends Evaluator {
    @Override
    public boolean evaluate(TinyBasicParser.StatementContext statement) throws TinyBasicException {
        throw new StopExecutionException(0);
    }
}

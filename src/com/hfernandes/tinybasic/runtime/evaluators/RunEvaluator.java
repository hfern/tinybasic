package com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.runtime.exceptions.TinyBasicException;

public class RunEvaluator extends Evaluator {
    @Override
    public boolean evaluate(TinyBasicParser.StatementContext statement) throws TinyBasicException {
        // This implementation starts execution immediately.
        // Therefore RUN is just a way to restart execution of the program
        pe.state.pc = 0;
        return true;
    }
}

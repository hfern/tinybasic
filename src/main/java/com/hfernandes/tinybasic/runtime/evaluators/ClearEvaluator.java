package com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.runtime.exceptions.TinyBasicException;

import java.io.PrintStream;

public class ClearEvaluator extends Evaluator {
    @Override
    public boolean evaluate(TinyBasicParser.StatementContext statement) throws TinyBasicException {
        // best we can do is print newlines for x-compat
        PrintStream stream = new PrintStream(pe.state.os);
        for (int i = 0; i < 80; i++) {
            stream.print("\n");
        }
        return true;
    }
}

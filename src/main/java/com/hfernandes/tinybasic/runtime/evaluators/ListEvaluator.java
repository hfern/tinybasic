package com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.runtime.exceptions.TinyBasicException;

import java.io.PrintStream;

public class ListEvaluator extends Evaluator {
    @Override
    public boolean evaluate(TinyBasicParser.StatementContext statement) throws TinyBasicException {
        PrintStream stream = new PrintStream(pe.state.os);
        stream.print(pe.programContext.start.getInputStream().toString());
        return true;
    }
}

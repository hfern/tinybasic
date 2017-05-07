package com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.runtime.ProgramEvaluator;
import com.hfernandes.tinybasic.runtime.exceptions.TinyBasicException;
import org.antlr.v4.runtime.tree.Tree;

public abstract class Evaluator {
    protected ProgramEvaluator pe;

    final public void setProgramEvaluator(ProgramEvaluator pe) {
        this.pe = pe;
    }

    public abstract boolean evaluate(TinyBasicParser.StatementContext statement)
            throws TinyBasicException;
}

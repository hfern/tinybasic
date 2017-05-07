package com.hfernandes.tinybasic.runtime.exceptions;

public class GrammarViolatedException extends TinyBasicException {
    public GrammarViolatedException() {
        super("A grammar invariant was violated. " +
                "Antlr should have rejected the source code before it got evaluated. " +
                "This is a irrecoverable error and should never happen.");
    }
}

package com.hfernandes.tinybasic.runtime.exceptions;

public class UnsetVariableException extends TinyBasicException {
    public UnsetVariableException(String varName) {
        super("Tried to access variable '" + varName + "' before it is assigned!");
    }
}

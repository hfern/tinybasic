package com.hfernandes.tinybasic.runtime.exceptions;

import com.hfernandes.tinybasic.runtime.vals.Value;

public class BadGotoException extends TinyBasicException {
public Integer destination;

    public BadGotoException(Value destination) {
        super("Bad GOTO destination '" + destination.val + "'");
        this.destination = destination.val;
    }
}

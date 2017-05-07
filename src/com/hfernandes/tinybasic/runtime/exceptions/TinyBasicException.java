package com.hfernandes.tinybasic.runtime.exceptions;

@SuppressWarnings("Since15")
public class TinyBasicException extends Exception {
    public TinyBasicException() {
    }

    public TinyBasicException(String s) {
        super(s);
    }

    public TinyBasicException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public TinyBasicException(Throwable throwable) {
        super(throwable);
    }

    public TinyBasicException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}

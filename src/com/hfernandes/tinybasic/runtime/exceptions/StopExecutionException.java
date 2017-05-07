package com.hfernandes.tinybasic.runtime.exceptions;

// StopExecutionException is thrown when program execution must be stopped.
// This is different in the a stop execution is thrown when the program is expected
// to quit, vs other exceptions which are thrown strictly on runtime errors.
// This can either be cleanly or with an error code.
public class StopExecutionException extends TinyBasicException {
    public int statusCode;

    public StopExecutionException(int status) {
        statusCode = status;
    }
}

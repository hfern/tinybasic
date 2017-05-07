package com.hfernandes.tinybasic.antlrstrap;

import java.util.List;

// A collection of complaints about an input file
public class AntlrException extends Exception {
    public List<AntlrError> errors;

    public AntlrException(List<AntlrError> errors) {
        this.errors = errors;
    }

    @Override
    public String getMessage() {
        return getParseErrorMessage();
    }

    public String getParseErrorMessage() {
        String message = "There were errors encountered parsing the program:\n";
        for (AntlrError error : errors) {
            message += "> " + error + "\n";
        }
        return message;
    }
}

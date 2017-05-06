package com.hfernandes.tinybasic.antlrstrap;

import java.util.List;

// A collection of complaints about an input file
public class AntlrException extends Exception {
    public List<AntlrError> errors;

    public AntlrException(List<AntlrError> errors) {
        this.errors = errors;
    }
}

package com.hfernandes.tinybasic.antlrstrap;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

// ErrorListener makes is so that we can intercept ANTLR source errors and throw exceptions
// instead of just print to stderr
public class ErrorListener extends BaseErrorListener {
    private List<AntlrError> errors;

    public ErrorListener() {
        this.errors = new ArrayList<AntlrError>();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        AntlrError error = new AntlrError();

        String sourceName = recognizer.getInputStream().getSourceName();
        error.sourceName = sourceName;
        error.lineNo = line;
        error.charNo = charPositionInLine;
        error.antlrMessage = msg;

        errors.add(error);
    }

    boolean hasErrors() {
        return this.errors.size() > 0;
    }

    public void raiseErrors() throws AntlrException {
        if (hasErrors()) {
            throw new AntlrException(errors);
        }
    }
}

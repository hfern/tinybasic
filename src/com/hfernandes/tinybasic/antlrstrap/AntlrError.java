package com.hfernandes.tinybasic.antlrstrap;

// A specific error that caused ANTLR to complain
public class AntlrError {
    public String sourceName;
    public int lineNo;
    public int charNo;
    public String antlrMessage;

    public AntlrError() {
        sourceName = "";
        lineNo = 0;
        charNo = 0;
        antlrMessage = "<no antlr detail>";
    }

    @Override
    public String toString() {
        return sourceName + ":" + lineNo + ":" + charNo + ": " + antlrMessage;
    }
}

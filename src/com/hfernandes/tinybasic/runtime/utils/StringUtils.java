package com.hfernandes.tinybasic.runtime.utils;

public class StringUtils {

    // unwraps and converts any escapes in a user-supplied string
    public static String unwrapStringVal(String stringLiteral) {
        return stringLiteral.substring(1, stringLiteral.length() - 1);
    }
}


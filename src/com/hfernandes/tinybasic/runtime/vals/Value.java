package com.hfernandes.tinybasic.runtime.vals;

// A variable can hold an Integer
public class Value {
    public Integer val;

    public Value() {
        val = 0;
    }

    public Value(int i) {
        val = i;
    }

    public Value(Integer i) {
        val = i;
    }
}

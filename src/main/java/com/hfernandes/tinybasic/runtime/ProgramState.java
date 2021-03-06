package com.hfernandes.tinybasic.runtime;

import com.hfernandes.tinybasic.runtime.exceptions.UnsetVariableException;
import com.hfernandes.tinybasic.runtime.vals.Value;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Stack;

// This represents the state of the program, including
//  - Variables
//  - marked line numbers to program lines
//  - conditional stack
public class ProgramState {

    // Map of variable name to the variable value.
    public HashMap<String, Value> varMap;

    // Map of programmer-tagged "line-number" to the index into the stmt list.
    public HashMap<String, Integer> lineMap;

    // Cond-Stack...?
    // TODO(hunter): Implement this.

    // Stmt index to run next.
    public Integer pc;

    // The input stream to read from
    public InputStream is;

    // The standard output stream to write to
    public OutputStream os;

    // stack of return PCs for use in functions calls
    public Stack<Integer> retStack;

    public ProgramState() {
        varMap = new HashMap<String, Value>();
        lineMap = new HashMap<String, Integer>();
        pc = 0;

        is = System.in;
        os = System.out;
        retStack = new Stack<>();
    }

    public Value getVarVal(String varName) throws UnsetVariableException {
        Value val = varMap.get(varName);
        if (val == null) {
            throw new UnsetVariableException(varName);
        }

        return val;
    }
}

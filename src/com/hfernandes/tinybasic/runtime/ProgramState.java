package com.hfernandes.tinybasic.runtime;

import com.hfernandes.tinybasic.runtime.exceptions.UnsetVariableException;
import com.hfernandes.tinybasic.runtime.vals.Value;

import java.util.HashMap;

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

    public ProgramState() {
        varMap = new HashMap<String, Value>();
        lineMap = new HashMap<String, Integer>();
        pc = 0;
    }

    public Value getVarVal(String varName) throws UnsetVariableException {
        Value val = varMap.get(varName);
        if (val == null) {
            throw new UnsetVariableException(varName);
        }

        return val;
    }
}

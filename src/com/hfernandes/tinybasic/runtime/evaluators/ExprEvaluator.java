package com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.runtime.vals.StringVal;
import com.hfernandes.tinybasic.runtime.vals.Value;

// Evaluates an Expr
public class ExprEvaluator {
    public static Value evaluate(TinyBasicParser.ExpressionContext expr) {
        return new StringVal();
    }
}

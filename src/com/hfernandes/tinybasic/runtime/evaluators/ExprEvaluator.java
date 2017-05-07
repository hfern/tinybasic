package com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicLexer;
import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.runtime.ProgramState;
import com.hfernandes.tinybasic.runtime.exceptions.TinyBasicException;
import com.hfernandes.tinybasic.runtime.vals.Value;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Tree;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

// Evaluates an Expr
public class ExprEvaluator {
    public static Value evaluate(ProgramState state, TinyBasicParser.ExpressionContext expr) throws TinyBasicException {
        // case where just a simple number

        return new Value();
    }

    public static Value evaluateTerm(ProgramState state, TinyBasicParser.TermContext factor) throws TinyBasicException {
        throw new NotImplementedException();
    }

    public static Value evaluateFactor(ProgramState state, TinyBasicParser.FactorContext factor) throws TinyBasicException {
        ParseTree firstChild = factor.getChild(0);

        // variable
        if (isVariableNode(firstChild)) {
            return state.getVarVal(getVarName(firstChild));
        }

        // number
        if (firstChild instanceof TinyBasicParser.NumberContext) {
            return new Value(new Integer(firstChild.getText()));
        }
        // or paren'd ( expr )

        System.out.println("First Child:");

        return new Value();
    }

    protected static boolean isVariableNode(Tree tree) {
        return (tree instanceof TerminalNode) && ((TerminalNode) tree).getSymbol().getType() == TinyBasicLexer.VAR;
    }

    protected static String getVarName(Tree terminalNode) {
        return ((TerminalNode) terminalNode).getText();
    }
}

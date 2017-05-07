package com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicLexer;
import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.generated.TinyBasicParser.ExpressionContext;
import com.hfernandes.tinybasic.generated.TinyBasicParser.FactorContext;
import com.hfernandes.tinybasic.generated.TinyBasicParser.TermContext;
import com.hfernandes.tinybasic.runtime.ProgramState;
import com.hfernandes.tinybasic.runtime.exceptions.GrammarViolatedException;
import com.hfernandes.tinybasic.runtime.exceptions.TinyBasicException;
import com.hfernandes.tinybasic.runtime.utils.TokenRecognizer;
import com.hfernandes.tinybasic.runtime.utils.TreeFilter;
import com.hfernandes.tinybasic.runtime.vals.Value;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Tree;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

// Evaluates an Expr
public class ExprEvaluator {
    public static Value evaluate(ProgramState state, ExpressionContext expr) throws TinyBasicException {
        boolean negate = false;
        boolean skipFirst = false;

        if (TokenRecognizer.terminalIs(expr.getChild(0), TinyBasicLexer.SUB)) {
            negate = true;
            skipFirst = true;
        } else if (TokenRecognizer.terminalIs(expr.getChild(0), TinyBasicLexer.ADD)) {
            skipFirst = true;
        }

        ArrayList<TermContext> terms = TreeFilter.filter(expr, t -> t instanceof TermContext);
        ArrayList<TerminalNode> ops = TreeFilter.filter(expr, t -> TokenRecognizer.terminalIs(t, TinyBasicLexer.SUB)
                || TokenRecognizer.terminalIs(t, TinyBasicLexer.ADD));

        if (skipFirst) {
            ops.remove(0);
        }

        Value value = evaluateTerm(state, terms.get(0));

        for (int i = 0; i < ops.size(); i++) {
            Value value2 = evaluateTerm(state, terms.get(i + 1));

            if (TokenRecognizer.terminalIs(ops.get(i), TinyBasicLexer.ADD)) {
                value = new Value(value.val + value2.val);
            } else if (TokenRecognizer.terminalIs(ops.get(i), TinyBasicLexer.SUB)) {
                value = new Value(value.val - value2.val);
            } else {
                throw new GrammarViolatedException();
            }
        }

        if (negate) {
            value = new Value(value.val * -1);
        }

        return value;
    }

    public static Value evaluateTerm(ProgramState state, TermContext term) throws TinyBasicException {
        // a term is a list of factors with either MUL or DIV separating them.
        List<FactorContext> factors = TreeFilter.filter(term, t -> t instanceof FactorContext);
        List<TerminalNode> ops = TreeFilter.filter(term, t -> t instanceof TerminalNode);

        Value value = evaluateFactor(state, factors.get(0));

        // yes I know this evaluates ops left to right. Whatever.
        // screw PEMDAS
        for (int i = 0; i < ops.size(); i++) {
            Value value2 = evaluateFactor(state, factors.get(i + 1));

            if (TokenRecognizer.terminalIs(ops.get(i), TinyBasicLexer.MUL)) {
                value = new Value(value.val * value2.val);
            } else if (TokenRecognizer.terminalIs(ops.get(i), TinyBasicLexer.DIV)) {
                value = new Value(value.val / value2.val);
            } else {
                throw new GrammarViolatedException();
            }
        }

        return value;
    }

    public static Value evaluateFactor(ProgramState state, FactorContext factor) throws TinyBasicException {
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
        if (TokenRecognizer.terminalIs(firstChild, TinyBasicLexer.LPAREN)) {
            return evaluate(state, (ExpressionContext) factor.getChild(1));
        }

        throw new GrammarViolatedException();
    }

    protected static boolean isVariableNode(Tree tree) {
        return (tree instanceof TerminalNode) && ((TerminalNode) tree).getSymbol().getType() == TinyBasicLexer.VAR;
    }

    protected static String getVarName(Tree terminalNode) {
        return ((TerminalNode) terminalNode).getText();
    }
}

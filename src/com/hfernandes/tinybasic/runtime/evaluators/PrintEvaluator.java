package com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicLexer;
import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.runtime.exceptions.TinyBasicException;
import com.hfernandes.tinybasic.runtime.utils.StringUtils;
import com.hfernandes.tinybasic.runtime.utils.TokenRecognizer;
import com.hfernandes.tinybasic.runtime.utils.TreeFilter;
import com.hfernandes.tinybasic.runtime.vals.Value;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Tree;

import java.io.PrintStream;
import java.util.List;

public class PrintEvaluator extends Evaluator {
    @Override
    public boolean evaluate(TinyBasicParser.StatementContext stmt) throws TinyBasicException {
        PrintStream stream = new PrintStream(pe.state.os);
        Tree exprList = stmt.getChild(1);
        for (int i = 0; i < exprList.getChildCount(); i++) {
            Tree printable = exprList.getChild(i);

            if (TokenRecognizer.terminalIs(printable, TinyBasicLexer.STRING)) {
                stream.print(StringUtils.unwrapStringVal(((TerminalNode) printable).getText()));
            } else if (printable instanceof TinyBasicParser.ExpressionContext) {
                Value v = ExprEvaluator.evaluate(pe.state, (TinyBasicParser.ExpressionContext) printable);
                stream.print(v.val);
            }
        }

        stream.print("\r\n");
        return true;
    }
}

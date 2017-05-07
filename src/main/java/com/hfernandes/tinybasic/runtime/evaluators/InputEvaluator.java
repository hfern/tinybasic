package com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicLexer;
import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.runtime.exceptions.TinyBasicException;
import com.hfernandes.tinybasic.runtime.utils.TokenRecognizer;
import com.hfernandes.tinybasic.runtime.utils.TreeFilter;
import com.hfernandes.tinybasic.runtime.vals.Value;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Scanner;

public class InputEvaluator extends Evaluator {
    @Override
    public boolean evaluate(TinyBasicParser.StatementContext statement) throws TinyBasicException {
        List<TerminalNode> vars = TreeFilter.filter(
                statement.getChild(1),
                t -> TokenRecognizer.terminalIs(t, TinyBasicLexer.VAR)
        );

        Scanner kbd = new Scanner(pe.state.is);

        for (TerminalNode node: vars) {
            Value val = new Value(kbd.nextInt());
            pe.state.varMap.put(node.getText(), val);
        }

        return true;
    }
}

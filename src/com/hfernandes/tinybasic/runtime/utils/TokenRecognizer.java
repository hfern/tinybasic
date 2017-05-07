package com.hfernandes.tinybasic.runtime.utils;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Tree;

public class TokenRecognizer {
    public static boolean terminalIs(Tree tree, int tokenId) {
        return (tree instanceof TerminalNode) && ((TerminalNode) tree).getSymbol().getType() == tokenId;
    }
}

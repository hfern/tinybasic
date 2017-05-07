package com.hfernandes.tinybasic;

import com.hfernandes.tinybasic.antlrstrap.AntlrException;
import com.hfernandes.tinybasic.antlrstrap.ErrorListener;
import com.hfernandes.tinybasic.generated.TinyBasicLexer;
import com.hfernandes.tinybasic.generated.TinyBasicParser;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class ProgramParser {
    public static ParseTree getParseTree(String filename, boolean showGui) throws IOException, AntlrException {
        ErrorListener errorListener = new ErrorListener();

        CharStream input = CharStreams.fromFileName(filename);
        TinyBasicLexer lexer = new TinyBasicLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        TinyBasicParser parser = new TinyBasicParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
        ParseTree tree = parser.program();

        errorListener.raiseErrors();

        if (showGui) {
            Trees.inspect(tree, parser);
        }

        return tree;
    }

    public static ParseTree getParseTree(String filename) throws IOException, AntlrException {
        return getParseTree(filename, false);
    }
}

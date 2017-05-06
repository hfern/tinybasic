package com.hfernandes.tinybasic;

import com.hfernandes.tinybasic.antlrstrap.AntlrError;
import com.hfernandes.tinybasic.antlrstrap.AntlrException;
import com.hfernandes.tinybasic.generated.TinyBasicLexer;
import com.hfernandes.tinybasic.generated.TinyBasicParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import com.hfernandes.tinybasic.antlrstrap.ErrorListener;

import java.io.File;
import java.io.IOException;

public class Main {

    public static ParseTree getParseTree(String filename) throws IOException, AntlrException {
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
        return tree;
    }

    public static void main(String[] args) {
        ParseTree tree;

        String filename = "./tests/fixtures/echo1.basic";

        try {
            tree = getParseTree(filename);
        } catch (IOException e) {
            System.out.println("That file doesn't exist!");
            return;
        } catch (AntlrException e) {
            System.out.println("There were errors encountered parsing the program:");
            for (AntlrError error : e.errors) {
                System.out.println("> " + error);
            }
            return;
        }

        System.out.println("Got to here in this!");


    }
}

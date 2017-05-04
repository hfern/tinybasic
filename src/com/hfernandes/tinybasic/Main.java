package com.hfernandes.tinybasic;

import com.hfernandes.tinybasic.generated.TinyBasicLexer;
import com.hfernandes.tinybasic.generated.TinyBasicParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;

public class Main {

    public static ParseTree getParseTree(String filename) throws IOException
    {
        CharStream input = CharStreams.fromFileName(filename);
        TinyBasicLexer lexer = new TinyBasicLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        TinyBasicParser parser = new TinyBasicParser(tokenStream);
        ParseTree tree = parser.program();
        return tree;
    }

    public static void main(String[] args) {
        ParseTree tree;

        try
        {
            tree = getParseTree("./tests/fixtures/echo1.basic");
        } catch (IOException e)
        {
            System.out.println("That file doesn't exist!");
            return;
        }


    }
}

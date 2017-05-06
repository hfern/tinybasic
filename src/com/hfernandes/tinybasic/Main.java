package com.hfernandes.tinybasic;

import com.hfernandes.tinybasic.antlrstrap.AntlrError;
import com.hfernandes.tinybasic.antlrstrap.AntlrException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static com.hfernandes.tinybasic.ProgramParser.getParseTree;

public class Main {

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

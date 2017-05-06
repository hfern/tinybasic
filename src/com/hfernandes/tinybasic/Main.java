package com.hfernandes.tinybasic;

import com.hfernandes.tinybasic.antlrstrap.AntlrError;
import com.hfernandes.tinybasic.antlrstrap.AntlrException;
import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.runtime.ProgramEvaluator;
import com.hfernandes.tinybasic.runtime.ProgramState;
import org.antlr.v4.runtime.tree.ParseTree;
import com.hfernandes.tinybasic.ProgramParser;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        ParseTree tree;

        String filename = "fixtures/simple-print.basic";

        try {
            tree = ProgramParser.getParseTree(filename);
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

        ProgramEvaluator evaluator = new ProgramEvaluator(new ProgramState());
        evaluator.setProgram((TinyBasicParser.ProgramContext) tree);

        for (int stepCount = 0; evaluator.step(); stepCount++) {
            // pass :)
        }

        System.out.println("Got to here in this!");


    }
}

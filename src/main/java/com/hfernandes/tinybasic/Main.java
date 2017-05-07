package com.hfernandes.tinybasic;

import com.hfernandes.tinybasic.antlrstrap.AntlrError;
import com.hfernandes.tinybasic.antlrstrap.AntlrException;
import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.runtime.ProgramEvaluator;
import com.hfernandes.tinybasic.runtime.ProgramState;
import com.hfernandes.tinybasic.runtime.exceptions.StopExecutionException;
import com.hfernandes.tinybasic.runtime.exceptions.TinyBasicException;
import org.antlr.v4.runtime.tree.ParseTree;
import com.hfernandes.tinybasic.ProgramParser;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please specify file to run.");
            usage();
            return;
        }

        run(args[0]);
    }

    public static void usage() {
        System.out.println("--------------------------------");
        System.out.println("    TinyBasic Implementation    ");
        System.out.println("      By Hunter Fernandes");
        System.out.println("--------------------------------");
        System.out.println("Usage:");
        System.out.println("   tinybasic <FILENAME>");
    }

    public static void run(String filename) {
        ParseTree tree;

        try {
            tree = ProgramParser.getParseTree(filename);
        } catch (IOException e) {
            System.out.println("That file doesn't exist!");
            return;
        } catch (AntlrException e) {
            System.out.println();
            return;
        }

        ProgramEvaluator evaluator = new ProgramEvaluator(new ProgramState());
        evaluator.setProgram((TinyBasicParser.ProgramContext) tree);

        try {
            for (int stepCount = 0; evaluator.step(); stepCount++) {
                // pass :)
            }
        } catch (StopExecutionException e) {
            System.out.println("(The program explicitly exited with status " + e.statusCode +")");
        } catch (TinyBasicException e) {
            System.out.println("An error occurred during execution: " + e);
            e.printStackTrace();
            return;
        }

        System.out.println("Got to here in this!");


    }
}

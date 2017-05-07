package com.hfernandes.tinybasic;

public class ProgramOptions {
    public String fileName;
    public boolean showGui;
    public boolean showHelp;

    public ProgramOptions() {
        fileName = null;
        showGui = false;
        showHelp = false;
    }

    public static ProgramOptions fromArgs(String[] args) {
        ProgramOptions options = new ProgramOptions();

        for (int i = 0; i < args.length; i++) {

            if (args[i].equals("--gui")) {
                options.showGui = true;
                continue;
            }

            if (args[i].equals("--help") || args[i].equals("-?") || args[i].equals("-h")) {
                options.showHelp = true;
                continue;
            }

            options.fileName = args[i];
        }

        return options;
    }

    public static String usage() {
        String helpText = "" +
                "--------------------------------\n" +
                "    TinyBasic Implementation    \n" +
                "      By Hunter Fernandes\n" +
                "--------------------------------\n" +
                "Usage:\n" +
                "   tinybasic [--help] [--gui] FILENAME\n" +
                "\n" +
                "       --gui       Show AST GUI instead of executing.\n" +
                "       --help      Show this help message.\n";
        return helpText;
    }
}
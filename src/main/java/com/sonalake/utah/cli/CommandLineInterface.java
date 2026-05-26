package com.sonalake.utah.cli;

import com.google.gson.GsonBuilder;
import com.sonalake.utah.Parser;
import com.sonalake.utah.config.Config;
import org.apache.commons.cli.*;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.lang3.StringUtils;
import java.io.*;
import java.util.*;

public class CommandLineInterface {

    private static final String FORMAT_PARAM = "o";

    private static final String CONFIG_PARAM = "f";

    public static void main(String[] args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void processArgs(String[] args, Reader source, PrintStream target) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Print the content of the parsed records as json to the target
     *
     * @param parser
     */
    void printToJSON(Parser parser, PrintStream target) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a list of headers, prints the headers, then prints the records for each header.
     * If a record doesn't exist for a header, a blank space is put in its place
     *
     * @param parser
     * @param target
     * @throws IOException
     */
    void printToCSV(Parser parser, PrintStream target) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Converts mapList to JSON Object ready for printing
     *
     * @param mapList
     * @return
     */
    static String mapListToJSON(List<Map<String, String>> mapList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Parser parseInput(CLIConfig cliConfig, BufferedReader reader) throws FileNotFoundException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /*
     * Set-up for the Apache Commons CLI options
     */
    Options buildOptions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    CLIConfig parse(String[] args) throws ParseException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /*
     * Loads the configuration for the parser from the command line input.
     */
    CLIConfig deriveConfig(CommandLine cmd) throws ParseException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

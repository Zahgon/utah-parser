package com.sonalake.utah.cli;

import com.sonalake.utah.config.Config;
import com.sonalake.utah.config.ConfigLoader;
import java.io.*;

public class CLIConfig {

    public CLIConfig(Format format, String pathToConfig) {
        this.format = format;
        this.pathToConfig = pathToConfig;
    }

    public Config loadConfig() throws FileNotFoundException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    enum Format {

        CSV, JSON
    }

    private final Format format;

    private final String pathToConfig;

    Format getFormat() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String getPathToConfig() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

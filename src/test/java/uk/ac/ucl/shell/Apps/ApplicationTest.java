package uk.ac.ucl.shell.Apps;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import uk.ac.ucl.shell.Directory;
import uk.ac.ucl.shell.Exceptions.MissingArgumentsException;
import uk.ac.ucl.shell.Exceptions.TooManyArgumentsException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public abstract class ApplicationTest {

    protected String lineSeparator;
    private ByteArrayOutputStream out;
    private OutputStreamWriter writer;
    private String appName;
    private String currentDir;

    @Before
    public void setUp() throws Exception {
        appName = setAppName();
        lineSeparator = System.getProperty("line.separator");
        out = new ByteArrayOutputStream();
        writer = new OutputStreamWriter(out);
        currentDir = System.getProperty("user.dir");
    }

    @After
    public void tearDown() throws Exception {
        writer.close();
        Directory.getInstance().setCurrentDirectory(currentDir);
    }

    public abstract String setAppName();

    public void execApp(ArrayList<String> args, String input) throws IOException {
        ApplicationFactory.getApp(appName, args, createInputStream(input), writer).exec();
    }

    private InputStream createInputStream(String input) {
        if (input == null) {
            return null;
        }
        return new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
    }

    protected ArrayList<String> createArgs(String... args) {
        return new ArrayList<>(List.of(args));
    }

    public ByteArrayOutputStream getOut() {
        return out;
    }

}

package uk.ac.ucl.shell.Apps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Queue;

import uk.ac.ucl.shell.Exceptions.InvalidOptionException;
import uk.ac.ucl.shell.Exceptions.MissingArgumentsException;
import uk.ac.ucl.shell.Exceptions.TooManyArgumentsException;

public class Tail extends Application {
    private int numOfLines;
    private final Queue<String> tailLines;

    public Tail(String appName, ArrayList<String> args, InputStream input, OutputStreamWriter output) {
        super(appName, args, input, output);
        this.numOfLines = 10;
        this.tailLines = new java.util.LinkedList<>();
    }

    @Override
    protected void checkArgs() {
        if (args.isEmpty() && input == null) {
            throw new MissingArgumentsException(appName);
        }else if(args.isEmpty()){
            return;
        }
        if (args.get(0).equals("-n")) {
            if(args.size() > 3){
                throw new TooManyArgumentsException(appName);
            }
        }else if (args.size() > 1) {
            throw new TooManyArgumentsException(appName);
        }
        if (args.size() == 2 && input == null) {
            throw new MissingArgumentsException(appName);
        }
    }

    @Override
    protected void eval() throws IOException {
        loadOption();
        setIsPiped();
        redirect();
    }

    @Override
    protected void redirect() throws IOException {
        if (this.isPiped) {
            this.pipedCall();
        } else {
            this.simpleCall(this.args.get(0));
        }
    }

    @Override
    protected void app(BufferedReader reader) throws IOException {
        getTailLines(reader);
        for (String line : this.tailLines) {
            this.terminal.writeLine(line, writer, lineSeparator);
        }
    }

    private void getTailLines(BufferedReader reader) throws IOException {
        while (reader.ready()) {
            String line = reader.readLine();
            this.tailLines.add(line);
            if (this.tailLines.size() > this.numOfLines) {
                this.tailLines.remove();
            }
        }
    }

    private void loadOption() {
        if (!this.args.isEmpty() && this.args.get(0).equals("-n")) {
            this.numOfLines = parseNumber(this.args.get(1));
            this.args.remove(0);
            this.args.remove(0);
        }
    }

    private int parseNumber(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            throw new InvalidOptionException(appName, str);
        }
    }
}

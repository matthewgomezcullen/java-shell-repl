package uk.ac.ucl.shell.Apps;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Exit implements Application{


    public void exec(ArrayList<String> args, InputStream input, OutputStreamWriter output) throws IOException {
        // TODO: Implement exit
        System.exit(0);
    }
    
    
}
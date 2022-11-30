package uk.ac.ucl.shell;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import uk.ac.ucl.shell.Commands.Seq;

public class Shell {

    public static void eval(String input, OutputStream output) throws IOException {
        Seq command = new Seq(input);
        command.eval(null, output);
    }

    public static void main(String[] args) {

        if (args.length > 0) {

            // When running in non-interactive mode
            if (args.length != 2) {
                Terminal.getInstance().printError("COMP0010 shell: wrong number of arguments");
                return;
            }
            if (!args[0].equals("-c")) {
                Terminal.getInstance().printError("COMP0010 shell: " + args[0] + ": unexpected argument");
                return;
            }
            // Attempt to evaluate command
            try {
                eval(args[1], System.out);
            } catch (Exception e) {
                System.out.println("COMP0010 shell: " + e.getMessage());
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            try {
                while (true) {
                    String prompt = Directory.getInstance().getCurrentDirectory() + "> ";
                    System.out.print(prompt);
                    try {
                        String cmdline = scanner.nextLine();
                        eval(cmdline, System.out);
                    } catch (Exception e) {
                        Terminal.getInstance().printError("COMP0010 shell: " + e.getMessage());
                    }
                }
            } finally {
                scanner.close();
            }
        }
    }

}

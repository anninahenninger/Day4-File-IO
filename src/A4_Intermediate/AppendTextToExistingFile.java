package A4_Intermediate;


/*
Write a Java program to append text to an existing text file.
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendTextToExistingFile {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide output file");
            System.exit(0);
        }

        String outputFile = args[0];
        String ourText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                "\n" +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,\n" +
                "\n" +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book.\n";


        try {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(outputFile,true);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.append(ourText);


            // Always close files.
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("Error writing to file '" + outputFile + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}

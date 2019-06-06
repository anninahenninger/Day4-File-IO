package A0_PreworkExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// Copy a file
public class CopyingWithByteArray {
    private static void usage() {
        System.err.println("java Cp1 <input file> <output file>");
        System.exit(1);
    }

    public static void main(String args[]) {
        if (args.length != 2)
            usage();

        Path inputFile = Paths.get(args[0]);
        Path outputFile = Paths.get(args[1]);

        try {
            byte[] contents = Files.readAllBytes(inputFile);
            Files.write(outputFile, contents,
                    StandardOpenOption.WRITE,
                    //StandardOpenOption.APPEND,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            System.err.println("ERROR: " + e);
            System.exit(1);
        }
    }
}

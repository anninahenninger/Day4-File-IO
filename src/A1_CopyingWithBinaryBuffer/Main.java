package A1_CopyingWithBinaryBuffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// Copy files using binary buffers
public class Main {
    private static void usage() {
        System.err.println("java Dd <input file> <output file> <buffer size>");
        System.exit(1);
    }
    public static void main(String args[]) {
        if (args.length != 3)
            usage();
        Path inputPath = Paths.get(args[0]);
        Path outputPath = Paths.get(args[1]);
        try {
            int bufferSize = Integer.parseInt(args[2]);
            if (bufferSize <= 0)
                throw new NumberFormatException(args[2] + " is not positive");
            BufferedInputStream input;
            BufferedOutputStream output;
            input = new BufferedInputStream(
                    Files.newInputStream(inputPath , StandardOpenOption.READ));
            output = new BufferedOutputStream( Files.newOutputStream(outputPath ,
                    StandardOpenOption.WRITE , StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING));
            byte [] buffer = new byte[bufferSize];
            int bytesRead = input.read(buffer, 0, bufferSize);
            while ( bytesRead >= 0 ) {
                output.write(buffer, 0, bytesRead);
                bytesRead = input.read(buffer, 0, bufferSize);
            }
            input.close();
            output.close();
        } catch (IOException e) {
            System.err.println("ERROR: " + e);
            System.exit(1);
        } catch (NumberFormatException e) {
            System.err.println("ERROR: Bad number format: " + e);
            System.exit(1);
        }
    }
}
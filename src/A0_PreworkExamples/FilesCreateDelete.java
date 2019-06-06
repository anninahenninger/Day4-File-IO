package A0_PreworkExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesCreateDelete {
    private static void usage() {
        System.err.println("java CreateOrDelete <file>");
        System.err.println(" The <file> argument is required.");
        System.exit(1);
    }

    public static void main(String args[]) {
        if (args.length != 1)
            usage();

        Path path = Paths.get(args[0]);
        try {
            if (Files.exists(path))
                Files.delete(path);
            else
                Files.createFile(path);
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
    }
}

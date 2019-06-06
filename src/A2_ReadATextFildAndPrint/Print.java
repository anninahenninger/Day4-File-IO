package A2_ReadATextFildAndPrint;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Print {
    public static void use() {

        System.err.println("Print on screen <file>");
        System.exit(1);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            use();
        }

        Path path = Paths.get(args[0]);

        try {
            byte[] content = Files.readAllBytes(path);

            for (int i = 0; i < content.length; i++) {
                System.out.print((char) content[i]);
            }
        }catch(IOException e){
                System.err.println("Error: " + e);
                System.exit(1);
            }
        }
    }


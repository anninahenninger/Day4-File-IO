package A5_CheckFileAndDirectory;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *  Write a program to check if a file or directory exists and has read and write permission.
 */

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\2JavaCourse2\\week5\\dastext.txt");

        System.out.println(" exists = " + Files.exists(path));
        System.out.println(" readable = " + Files.isReadable(path));
        System.out.println(" writeable = " + Files.isWritable(path));

    }
}

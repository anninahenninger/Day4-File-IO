package A0_PreworkExamples;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class FileExample {

    public static void main(String args[]) {
        Path path = Paths.get("D:\\2JavaCourse2\\week5\\dastext.txt");
        System.out.println("path = " + path);
        System.out.println(" exists = " + Files.exists(path));
        System.out.println(" readable = " + Files.isReadable(path));
        System.out.println(" writeable = " + Files.isWritable(path));
        System.out.println(" executeable = " + Files.isExecutable(path));

        path = Paths.get("D:\\2JavaCourse2\\week5\\notexist.txt");

        System.out.println("path = " + path);
        System.out.println(" exists = " + Files.exists(path));
        System.out.println(" readable = " + Files.isReadable(path));
        System.out.println(" writeable = " + Files.isWritable(path));
        System.out.println(" executeable = " + Files.isExecutable(path));
    }
}

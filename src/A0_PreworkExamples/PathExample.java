package A0_PreworkExamples;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String args[]) {
        Path path = java.nio.file.Paths.get("D:\\2JavaCourse2\\week5\\dastext.txt");

        System.out.println("path = " + path);
        System.out.println("is absoute? = " + path.isAbsolute());
        System.out.println("file short name = " + path.getFileName());
        System.out.println("parent = " + path.getParent()); System.out.println("uri = " + path.toUri());
    }
}

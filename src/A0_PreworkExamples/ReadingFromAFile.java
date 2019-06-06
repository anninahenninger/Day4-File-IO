package A0_PreworkExamples;

import java.nio.charset.Charset;

public class ReadingFromAFile {
    public static void main(String args[]) {
        // find default charset
        System.out.println("Default Charset = " + Charset.defaultCharset());

        // Use Latin1 for file i/o instead of the default charset
        System.setProperty("file.encoding", "ISO-8859-1");
        System.out.println("file.encoding = " + System.getProperty("file.encoding"));

        // Example of directly using charset objects
        Charset ascii = Charset.forName("US-ASCII");
        System.out.println("Standard charset in old systems = " + ascii);
    }
}

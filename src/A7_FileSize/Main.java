package A7_FileSize;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\2JavaCourse2\\week5\\Day4-File-IO\\src\\A7_FileSize\\BytesText.txt");

        System.out.println(getFileSizeBytes(file));
        System.out.println(getFileSizeKiloBytes(file));
        System.out.println(getFileSizeMegaBytes(file));
    }
    public static String getFileSizeBytes(File file){
        String length = file.length() + " bytes";
        return length;
    }

    public static String getFileSizeKiloBytes(File file){
        return file.length() / 1024 + " KB";
    }

    public static String getFileSizeMegaBytes(File file){
        return file.length() / (1024 * 1024) + " MB";
    }

}

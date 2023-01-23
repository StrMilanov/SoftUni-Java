package SoftUniJavaAdvanced.Lab_03;

import java.io.File;

public class P07_ListFiles {
    public static void main(String[] args) {

        String folderPath = "D:\\Coding\\SoftUni\\03-Java-Advanced-PPT\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File file = new File(folderPath);
        File[] nestedFiles = file.listFiles();

        for (File nestedFile : nestedFiles) {
            if (nestedFile.isFile()){
                System.out.printf("%s: [%d]%n", nestedFile.getName(), nestedFile.length());
            }
        }


//        if (file.exists()) {
//            if (file.isDirectory()) {
//                File[] files = file.listFiles();
//                for (File f : files) {
//                    if (!f.isDirectory()) {
//                        System.out.printf("%s: [%d]%n", f.getName(), f.length());
//                    }
//                }
//            }
//        }


    }
}

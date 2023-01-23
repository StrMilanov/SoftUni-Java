package SoftUniJavaAdvanced.Lab_03;

import java.io.File;

public class P08_NestedFolders {
    public static void main(String[] args) {

        String folderPath = "D:\\Coding\\SoftUni\\03-Java-Advanced-PPT\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File root = new File(folderPath);
        File[] nestedFiles = root.listFiles();
    }
}

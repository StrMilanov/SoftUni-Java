package SoftUniJavaAdvanced.Ex_04;

import java.io.File;
import java.io.IOException;

public class P08_GetFolderSize {
    public static void main(String[] args) throws IOException {

        String basePath = "D:\\Coding\\.Projects - InteliJ\\SoftUni-Java\\SoftUni-Advanced-Java\\src\\SoftUniJavaAdvanced\\Ex_04\\files\\Exercises Resources";

        // No file reader, as we're looking at folders only

        File folder = new File(basePath);
        File[] allFilesInFolder = folder.listFiles();       // all files in folder

        int folderSize = 0;
        if (allFilesInFolder != null) {                     // do if folder contains files
            for (File file : allFilesInFolder) {
                folderSize += file.length();
            }
        }

        System.out.println("Folder size: " + folderSize);

    }
}

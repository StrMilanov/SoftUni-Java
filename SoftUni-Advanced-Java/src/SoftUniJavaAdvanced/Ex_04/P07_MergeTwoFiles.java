package SoftUniJavaAdvanced.Ex_04;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class P07_MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        String basePath = "D:\\Coding\\.Projects - InteliJ\\SoftUni-Java\\SoftUni-Advanced-Java\\src\\SoftUniJavaAdvanced\\Ex_04\\files";
        String fileOnePath = basePath + "\\inputOne.txt";
        String fileTwoPath = basePath + "\\inputTwo.txt";
        String outputPath = basePath + "\\output_P07.txt";

        try (BufferedReader bfReader = new BufferedReader(new FileReader(fileOnePath));
             PrintWriter prWriter = new PrintWriter(outputPath)) {

            List<String> allLinesFileOne = Files.readAllLines(Path.of(fileOnePath));
            List<String> allLinesFileTwo = Files.readAllLines(Path.of(fileTwoPath));

            for (String line : allLinesFileOne) {
                prWriter.println(line);
            }
            for (String line : allLinesFileTwo){
                prWriter.println(line);
            }

        } catch (IOException e) {
            throw new IOException(e);
        }

    }
}

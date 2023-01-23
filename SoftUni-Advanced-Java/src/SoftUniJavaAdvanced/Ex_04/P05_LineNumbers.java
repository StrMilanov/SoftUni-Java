package SoftUniJavaAdvanced.Ex_04;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class P05_LineNumbers {
    public static void main(String[] args) throws IOException {

        String basePath = "D:\\Coding\\.Projects - InteliJ\\SoftUni-Java\\SoftUni-Advanced-Java\\src\\SoftUniJavaAdvanced\\Ex_04\\files";
        String inputPath = basePath + "\\inputLineNumbers.txt";
        String outputPath = basePath + "\\output_P05.txt";

        try (BufferedReader bfReader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter bfWriter = new BufferedWriter(new FileWriter(outputPath))) {

            List<String> allLines = Files.readAllLines(Path.of(inputPath));

            int lineCounter = 1;
            for (String line : allLines) {
                bfWriter.write(lineCounter + ". " + line);
                bfWriter.newLine();
                lineCounter++;
            }

        } catch (IOException e) {
            throw new IOException(e);
        }

    }
}

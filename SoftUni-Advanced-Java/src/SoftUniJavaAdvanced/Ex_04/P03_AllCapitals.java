package SoftUniJavaAdvanced.Ex_04;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

public class P03_AllCapitals {
    public static void main(String[] args) throws IOException {

        String basePath = "D:\\Coding\\.Projects - InteliJ\\SoftUni-Java\\SoftUni-Advanced-Java\\src\\SoftUniJavaAdvanced\\Ex_04\\files";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output.txt";

        try (BufferedReader inputStream = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            List<String> allLines = Files.readAllLines(Path.of(inputPath));

            // v1
            for (String line : allLines) {
                writer.write(line.toUpperCase(Locale.ROOT));
                writer.newLine();
            }


        } catch (IOException e) {
            throw new IOException(e);
        }

    }
}

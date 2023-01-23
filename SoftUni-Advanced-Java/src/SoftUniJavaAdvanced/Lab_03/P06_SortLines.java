package SoftUniJavaAdvanced.Lab_03;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P06_SortLines {
    public static void main(String[] args) throws IOException {

        String basePath = "D:\\Coding\\SoftUni\\03-Java-Advanced-PPT\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output-06-sort-lines.txt";

        Path inPath = Paths.get(inputPath);
        Path outPath = Paths.get(outputPath);

        try {

            List<String> lines = Files.readAllLines(inPath);

            lines = lines
                    .stream()
                    .filter(l -> !l.isBlank())
                    .collect(Collectors.toList());

            Collections.sort(lines);
            Files.write(outPath, lines);

        } catch (IOException e) {
            throw new IOException(e);
        }

    }
}

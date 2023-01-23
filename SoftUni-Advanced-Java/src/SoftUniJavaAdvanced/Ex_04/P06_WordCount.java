package SoftUniJavaAdvanced.Ex_04;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class P06_WordCount {
    public static void main(String[] args) throws IOException {

        String basePath = "D:\\Coding\\.Projects - InteliJ\\SoftUni-Java\\SoftUni-Advanced-Java\\src\\SoftUniJavaAdvanced\\Ex_04\\files";
        String fileWordsPath = basePath + "\\words.txt";
        String fileTextPath = basePath + "\\text.txt";
        String outputPath = basePath + "\\output_P06.txt";

        try (BufferedReader bfReaderWords = new BufferedReader(new FileReader(fileWordsPath));
             BufferedReader bfReaderText = new BufferedReader(new FileReader(fileTextPath));
             PrintWriter prWriter = new PrintWriter(outputPath)) {

            // READ WORDS FILE
            List<String> allLinesWithWords = Files.readAllLines(Path.of(fileWordsPath));
            Map<String, Integer> countWordsMap = new HashMap<>();
            for (String line : allLinesWithWords) {
                String[] wordsArray = line.split("\\s+");
                Arrays.stream(wordsArray).forEach(word -> countWordsMap.put(word, 0));
            }

            // READ TEXT FILE
            List<String> allLinesWithText = Files.readAllLines(Path.of(fileTextPath));
            for (String line : allLinesWithText) {
                line = line.replaceAll("\\.\\,\\?\\!\\:\\;", "");       // remove all punctuation
                String[] wordsArray = line.split("\\s+");
                for (String word : wordsArray) {
                    if (countWordsMap.containsKey(word)) {
                        countWordsMap.put(word, countWordsMap.get(word) + 1);
                    }
                }
            }

            // SORT & PRINT
            countWordsMap.entrySet()
                    .stream()
                    // SORTING -->
                    .sorted((e1, e2)-> e2.getValue().compareTo(e1.getValue()))
                    // <-- SORTING
                    .forEach(entry -> prWriter.println(entry.getKey() + " - " + entry.getValue()));


        } catch (IOException e) {
            throw new IOException(e);
        }

    }
}

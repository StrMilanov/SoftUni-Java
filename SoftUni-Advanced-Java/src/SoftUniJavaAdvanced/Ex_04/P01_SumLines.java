package SoftUniJavaAdvanced.Ex_04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class P01_SumLines {
    public static void main(String[] args) throws IOException {

        String basePath = "D:\\Coding\\.Projects - InteliJ\\SoftUni-Java\\SoftUni-Advanced-Java\\src\\SoftUniJavaAdvanced\\Ex_04\\files";
        String filepath = basePath + "\\input.txt";

        try (BufferedReader inputStream = new BufferedReader(new FileReader(filepath))) {

            List<String> allLines = Files.readAllLines(Path.of(filepath));

//            // v1
//            for (String line : allLines) {
//                int sum = 0;
//                for (int i = 0; i < line.length(); i++) {
//                    sum += line.toCharArray()[i];
//                }
//                System.out.println(sum);
//            }

            // v2
            allLines.stream()
                    .map(line -> line.toCharArray())
                    .forEach(arr -> {
                        int sum = 0;
                        for (char symbol : arr) {
                            sum += symbol;
                        }
                        System.out.println(sum);
                    });

        } catch (IOException e) {
            throw new IOException(e);
        }

    }
}

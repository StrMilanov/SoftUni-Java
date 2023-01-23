package SoftUniJavaAdvanced.Ex_04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class P02_SumBytes {
    public static void main(String[] args) throws IOException {

        String filePath = "D:\\Coding\\.Projects - InteliJ\\SoftUni-Java\\SoftUni-Advanced-Java\\src\\SoftUniJavaAdvanced\\Ex_04\\files\\input.txt";

        try (BufferedReader inputStream = new BufferedReader(new FileReader(filePath))) {

            List<String> allLines = Files.readAllLines(Path.of(filePath));
            long sum = 0;

//            // v1
//            for (String line : allLines) {
//                for (char symbol : line.toCharArray()) {
//                    if (symbol != 10 && symbol != 13) {
//                        sum += symbol;
//                    }
//                }
//            }

            // v2
            byte[] allBytes = Files.readAllBytes(Path.of(filePath));
            for (byte b : allBytes) {
                if (b != 10 && b != 13) {
                    sum += b;
                }
            }

            System.out.println(sum);

        } catch (IOException e) {
            throw new IOException(e);
        }

    }
}

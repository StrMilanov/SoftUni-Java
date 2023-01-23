package SoftUniJavaAdvanced.Lab_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P04_ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String basePath = "D:\\Coding\\SoftUni\\03-Java-Advanced-PPT\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output-04-extract-integers.txt";

        try (Scanner scanner = new Scanner(new FileInputStream(inputPath));
             PrintWriter outputStream = new PrintWriter(new FileOutputStream(outputPath))) {

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int n = scanner.nextInt();
                    outputStream.println(n);
                }
                scanner.next();
            }

        } catch (IOException e) {
            throw new IOException(e);
        }

    }
}

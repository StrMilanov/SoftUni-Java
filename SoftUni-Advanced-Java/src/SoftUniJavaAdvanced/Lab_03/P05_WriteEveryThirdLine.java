package SoftUniJavaAdvanced.Lab_03;

import java.io.*;

public class P05_WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String basePath = "D:\\Coding\\SoftUni\\03-Java-Advanced-PPT\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output-05-every-third-line.txt";

        try (BufferedReader inputStream = new BufferedReader(new FileReader(inputPath));
             PrintWriter outputStream = new PrintWriter(new FileWriter(outputPath))) {

            int countLine = 1;
            String line = inputStream.readLine();
            while (line != null) {
                if (countLine % 3 == 0) {
                    outputStream.println(line);
                }
                countLine++;
                line = inputStream.readLine();
            }

        } catch (IOException e) {
            throw new IOException(e);
        }

    }
}

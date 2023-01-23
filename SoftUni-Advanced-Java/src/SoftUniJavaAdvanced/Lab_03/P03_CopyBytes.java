package SoftUniJavaAdvanced.Lab_03;

import java.io.*;

public class P03_CopyBytes {
    public static void main(String[] args) throws IOException {

        String basePath = "D:\\Coding\\SoftUni\\03-Java-Advanced-PPT\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output-03-ascii.txt";

        try (InputStream inputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outputPath)) {
            int oneByte = 0;

            while ((oneByte = inputStream.read()) >= 0) {
                if (oneByte == 10 || oneByte == 32){
                    outputStream.write(oneByte);
                } else {
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i < digits.length(); i++) {
                        outputStream.write(digits.charAt(i));
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

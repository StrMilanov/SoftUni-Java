package SoftUniJavaFundamentals.Ex_08;

import java.util.Scanner;

public class P03_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPath = scanner.nextLine();

        String file = inputPath.substring(inputPath.lastIndexOf("\\") + 1);
        String fileName = file.split("\\.")[0];
        String fileExt = file.split("\\.")[1];

        System.out.printf("File name: %s\nFile extension: %s\n", fileName, fileExt);
    }
}

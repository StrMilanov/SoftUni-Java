package SoftUniJavaFundamentals.Ex_03;


import java.util.Arrays;
import java.util.Scanner;

public class P03_ZigZagArrays_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] array1 = new String[n];
        String[] array2 = new String[n];

        for (int i = 0; i < n; i++) {
            String[] currentLine = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                array1[i] = currentLine[0];
                array2[i] = currentLine[1];
            } else {
                array1[i] = currentLine[1];
                array2[i] = currentLine[0];
            }

        }

        System.out.println(String.join(" ", array1));
        System.out.println(String.join(" ", array2));

    }
}

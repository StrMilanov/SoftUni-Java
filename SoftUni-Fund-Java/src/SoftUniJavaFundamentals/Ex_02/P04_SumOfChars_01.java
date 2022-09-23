package SoftUniJavaFundamentals.Ex_02;

import java.util.Scanner;

public class P04_SumOfChars_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int totalSum = 0;

        for (int i = 1; i <= n; i++) {
            char character = scanner.nextLine().charAt(0);
            totalSum += character;
        }

        System.out.printf("The sum equals: %d", totalSum);

    }
}

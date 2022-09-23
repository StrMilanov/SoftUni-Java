package SoftUniJavaFundamentals.Lab_02;

import java.util.Scanner;

public class P12_RefactorSpecialNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numMax = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numMax; i++) {
            int currentNum = i;
            int sum = 0;

            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }

            boolean isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            String trueOrFalse = String.valueOf(isSpecialNum);
            System.out.printf("%d -> %s%n", i,
                    trueOrFalse.substring(0, 1).toUpperCase() + trueOrFalse.substring(1).toLowerCase());
        }
    }
}

package SoftUniJavaFundamentals.Ex_08;

import java.util.Scanner;

public class P02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");

        String str1 = "";
        String str2 = "";
        int totalSum = 0;

        if (inputArr[0].length() >= inputArr[1].length()) {
            str1 = inputArr[0];
            str2 = inputArr[1];
        } else {
            str1 = inputArr[1];
            str2 = inputArr[0];
        }

        totalSum = sumMultiplication(str1, str2);
        System.out.println(totalSum);

    }


    private static int sumMultiplication(String longer, String shorter) {
        int total = 0;
        for (int i = 0; i < shorter.length(); i++) {
            total += longer.charAt(i) * shorter.charAt(i);
        }

        for (int i = shorter.length(); i < longer.length(); i++) {
            total += longer.charAt(i);
        }
        return total;
    }

}

package SoftUniJavaFundamentals.Lab_04;

import java.util.Scanner;

public class P10_MultiplyEvensByOdds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(multiplySumOfEvenAndOdd(numInput));
    }

    public static int multiplySumOfEvenAndOdd(int num) {
        return sumEvenNumbers(num) * sumOddNumbers(num);
    }

    public static int sumEvenNumbers(int n) {
        int sumEvenNumbers = 0;
        while (n > 0) {
            int nextDigit = n % 10;
            if (nextDigit % 2 == 0) {
                sumEvenNumbers += nextDigit;
            }
            n /= 10;
        }
        return sumEvenNumbers;
    }

    public static int sumOddNumbers(int n) {
        int sumOddNumbers = 0;
        while (n > 0) {
            int nextDigit = n % 10;
            if (nextDigit % 2 != 0) {
                sumOddNumbers += nextDigit;
            }
            n /= 10;
        }
        return sumOddNumbers;
    }

}
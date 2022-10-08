package SoftUniJavaFundamentals.Ex_04;

import java.util.Scanner;

public class P10_TopNumber_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printTopNumbers(num);
    }

    public static void printTopNumbers(int n) {
        for (int i = 1; i < n; i++) {
            int currentNum = 0;
            if (sumOfDigits(i) % 8 == 0) {
                currentNum = i;
            }

            if (isHasOddDigit(currentNum)) {
                System.out.println(currentNum);
            }
        }

    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHasOddDigit(int n) {
        boolean isTrue = false;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 != 0) {
                isTrue = true;
                break;
            }
            n /= 10;
        }
        return isTrue;
    }

}

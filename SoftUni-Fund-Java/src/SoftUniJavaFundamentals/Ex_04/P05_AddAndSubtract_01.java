package SoftUniJavaFundamentals.Ex_04;

import java.util.Scanner;

public class P05_AddAndSubtract_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int sum = sumNumbers(num1, num2);
        System.out.println(subtractNumbers(sum, num3));
    }

    public static int sumNumbers(int a, int b) {
        return a + b;
    }

    public static int subtractNumbers(int a, int b) {
        return a - b;
    }
}

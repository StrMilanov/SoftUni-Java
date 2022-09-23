package SoftUniJavaFund.Lab_01;

import java.util.Scanner;

public class P09_SumOfOddNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i < n * 2; i+=2) {
            System.out.println(i);
            sum = sum + i;
        }

        System.out.printf("Sum: %d", sum);

    }
}

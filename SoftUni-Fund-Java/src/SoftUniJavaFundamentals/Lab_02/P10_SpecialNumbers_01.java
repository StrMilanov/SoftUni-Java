package SoftUniJavaFundamentals.Lab_02;

import java.util.Scanner;

public class P10_SpecialNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum == 5 || sum == 7 || sum == 0){
                System.out.println(i + " -> True");
            } else {
                System.out.println(i + " -> False");
            }

        }

    }
}

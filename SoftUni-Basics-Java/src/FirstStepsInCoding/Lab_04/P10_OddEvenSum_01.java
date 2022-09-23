package FirstStepsInCoding.Lab_04;

import java.util.Scanner;

public class P10_OddEvenSum_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int oddTotal = 0;
        int evenTotal = 0;

        for (int i = 1; i <= n; i++) {
            int numNext = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                evenTotal += numNext;
            } else {
                oddTotal += numNext;
            }
        }

        if (oddTotal == evenTotal) {
            System.out.printf("Yes\nSum = %d", oddTotal);
        } else {
            System.out.printf("No\nDiff = %d", Math.abs(oddTotal - evenTotal));
        }

    }
}

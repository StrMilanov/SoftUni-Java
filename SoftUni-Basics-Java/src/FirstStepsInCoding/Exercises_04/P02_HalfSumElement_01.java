package FirstStepsInCoding.Exercises_04;

import java.util.Scanner;

public class P02_HalfSumElement_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int numNext = Integer.parseInt(scanner.nextLine());
            sum += numNext;
            if (numNext > maxNum) {
                maxNum = numNext;
            }
        }

        if (sum - maxNum == maxNum) {
            System.out.printf("Yes\nSum = %d", maxNum);
        } else {
            System.out.printf("No\nDiff = %d", Math.abs(maxNum-(sum-maxNum)));
        }

    }
}

package FirstStepsInCoding.Lab_04;

import java.util.Scanner;

public class P09_LeftAndRightSum_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= n; i++) {
            int numLeft = Integer.parseInt(scanner.nextLine());
            sum1 += numLeft;
        }
        for (int i = 1; i <= n; i++) {
            int numRight = Integer.parseInt(scanner.nextLine());
            sum2 += numRight;
        }

        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sum1 - sum2));
        }
    }
}

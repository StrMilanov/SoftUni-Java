package SoftUniJavaFund.Ex_01;

import java.util.Scanner;

public class P04_PrintAndSum_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStart = Integer.parseInt(scanner.nextLine());
        int numEnd = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = numStart; i <= numEnd; i++) {
            sum += i;
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.printf("Sum: %d", sum);

    }
}

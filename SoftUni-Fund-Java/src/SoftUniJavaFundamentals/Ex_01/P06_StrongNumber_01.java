package SoftUniJavaFund.Ex_01;

import java.util.Scanner;

public class P06_StrongNumber_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int numStart = num;
        int sum = 0;


        while (num != 0) {
            int digit = num % 10;
            int digitFact = 1;

            for (int i = 1; i <= digit; i++) {
                digitFact = digitFact * i;
            }

            sum += digitFact;
            num = num / 10;
        }

        if (numStart == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}

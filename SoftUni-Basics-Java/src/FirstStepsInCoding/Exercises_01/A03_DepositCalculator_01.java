package FirstStepsInCoding.Exercises_01;

import java.util.Scanner;

public class A03_DepositCalculator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int timeMonths = Integer.parseInt(scanner.nextLine());
        double interestPerYear = Double.parseDouble(scanner.nextLine());

        double total = deposit + timeMonths * ((deposit * interestPerYear/100) /12);

        System.out.println(total);
    }
}

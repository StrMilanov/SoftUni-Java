package SoftUniJavaFund.Ex_01;

import java.util.Scanner;

public class P09_Orders_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orderCount = Integer.parseInt(scanner.nextLine());

        double priceCoffee = 0;
        double priceTotal = 0;

        for (int i = 1; i <= orderCount; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            priceCoffee = ((daysInMonth * capsulesCount) * pricePerCapsule);
            priceTotal += priceCoffee;

            System.out.printf("The price for the coffee is: $%.2f\n", priceCoffee);
        }

        System.out.printf("Total: $%.2f\n", priceTotal);

    }
}

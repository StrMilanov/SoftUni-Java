package SoftUniJavaFundamentals.Lab_04;

import java.util.Scanner;

public class P05_Orders_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int amountInput = Integer.parseInt(scanner.nextLine());

        calculateOrder(productInput, amountInput);
    }

    public static void calculateOrder(String product, int amount) {
        double sum = 0;
        switch (product) {
            case "coffee":
                sum = amount * 1.50;
                break;

            case "water":
                sum = amount * 1.00;
                break;

            case "coke":
                sum = amount * 1.40;
                break;

            case "snacks":
                sum = amount * 2.00;
                break;
        }

        System.out.printf("%.2f", sum);
    }

}

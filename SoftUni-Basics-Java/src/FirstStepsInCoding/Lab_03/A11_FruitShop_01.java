package FirstStepsInCoding.Lab_03;

import java.util.Scanner;

public class A11_FruitShop_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        double total = 0.0;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    total = amount * 2.50;
                } else if (fruit.equals("apple")) {
                    total = amount * 1.20;
                } else if (fruit.equals("orange")) {
                    total = amount * 0.85;
                } else if (fruit.equals("grapefruit")) {
                    total = amount * 1.45;
                } else if (fruit.equals("kiwi")) {
                    total = amount * 2.70;
                } else if (fruit.equals("pineapple")) {
                    total = amount * 5.50;
                } else if (fruit.equals("grapes")) {
                    total = amount * 3.85;
                }
                break;

            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    total = amount * 2.70;
                } else if (fruit.equals("apple")) {
                    total = amount * 1.25;
                } else if (fruit.equals("orange")) {
                    total = amount * 0.90;
                } else if (fruit.equals("grapefruit")) {
                    total = amount * 1.60;
                } else if (fruit.equals("kiwi")) {
                    total = amount * 3.00;
                } else if (fruit.equals("pineapple")) {
                    total = amount * 5.60;
                } else if (fruit.equals("grapes")) {
                    total = amount * 4.20;
                }
                break;
        }
        if (total <= 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", total);
        }

    }
}

package FirstStepsInCoding.TestExam_March2020;

import java.util.Scanner;

public class P03_EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = 0;
        double total = 0;

        String fruit = scanner.nextLine();
        String pack = scanner.nextLine();
        int orders = Integer.parseInt(scanner.nextLine());

        switch (fruit) {
            case "Watermelon":
                if (pack.equals("small")) {
                    price += 56 * 2;
                } else {
                    price += 28.70 * 5;
                }
                break;
            case "Mango":
                if (pack.equals("small")) {
                    price += 36.66 * 2;
                } else {
                    price += 19.60 * 5;
                }
                break;
            case "Pineapple":
                if (pack.equals("small")) {
                    price += 42.10 * 2;
                } else {
                    price += 24.80 * 5;
                }
                break;
            case "Raspberry":
                if (pack.equals("small")) {
                    price += 20 * 2;
                } else {
                    price += 15.20 * 5;
                }
                break;
        }

        total = price * orders;

        if (total >= 400 && total <= 1000) {
            total -= total * 0.15;
        } else if (total > 1000) {
            total -= total * 0.5;
        }

        System.out.printf("%.2f lv.", total);
    }
}

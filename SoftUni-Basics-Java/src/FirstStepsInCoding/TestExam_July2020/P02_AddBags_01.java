package FirstStepsInCoding.TestExam_July2020;

import java.util.Scanner;

public class P02_AddBags_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOver20 = Double.parseDouble(scanner.nextLine());
        double weightKg = Double.parseDouble(scanner.nextLine());
        int daysBeforeTravel = Integer.parseInt(scanner.nextLine());
        int amountLuggage = Integer.parseInt(scanner.nextLine());

        double price10to20 = priceOver20 * 0.5;
        double priceUnder10 = priceOver20 * 0.2;

        double total = 0;

        if (weightKg > 20) {
            if (daysBeforeTravel > 30) {
                total = (priceOver20 * amountLuggage) * 1.1;
            } else if (daysBeforeTravel >= 7) {
                total = (priceOver20 * amountLuggage) * 1.15;
            } else {
                total = (priceOver20 * amountLuggage) * 1.4;
            }
        } else if (weightKg >= 10) {
            if (daysBeforeTravel > 30) {
                total = (price10to20 * amountLuggage) * 1.1;
            } else if (daysBeforeTravel >= 7) {
                total = (price10to20 * amountLuggage) * 1.15;
            } else {
                total = (price10to20 * amountLuggage) * 1.4;
            }
        } else {
            if (daysBeforeTravel > 30) {
                total = (priceUnder10 * amountLuggage) * 1.1;
            } else if (daysBeforeTravel >= 7) {
                total = (priceUnder10 * amountLuggage) * 1.15;
            } else {
                total = (priceUnder10 * amountLuggage) * 1.4;
            }
        }

        System.out.printf("The total price of bags is: %.2f lv.", total);

    }
}

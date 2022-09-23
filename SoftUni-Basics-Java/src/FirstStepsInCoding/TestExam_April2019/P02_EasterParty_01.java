package FirstStepsInCoding.TestExam_April2019;

import java.util.Scanner;

public class P02_EasterParty_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountGuest = Integer.parseInt(scanner.nextLine());
        double pricePerPlate = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        if (amountGuest > 20) {
            pricePerPlate -= pricePerPlate * 0.25;
        } else if (amountGuest > 15) {
            pricePerPlate -= pricePerPlate * 0.2;
        } else if (amountGuest >= 10) {
            pricePerPlate -= pricePerPlate * 0.15;
        }

        double priceCake = budget * 0.1;

        double total = amountGuest * pricePerPlate + priceCake;

        if (budget >= total){
            System.out.printf("It is party time! %.2f leva left.", budget - total);
        } else {
            System.out.printf("No party! %.2f leva needed.", total - budget);
        }

    }
}

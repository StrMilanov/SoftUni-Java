package FirstStepsInCoding.Exercises_02;

import java.util.Scanner;

public class A05_GodzillaVsKong_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int amountActors = Integer.parseInt(scanner.nextLine());
        double priceCostume = Double.parseDouble(scanner.nextLine());

        double priceDecor = budget * 0.1;
        double priceCostumeTotal = priceCostume * amountActors;

        if (amountActors > 150) {
            priceCostumeTotal -= priceCostumeTotal * 0.1;
        }

        double priceTotal = priceCostumeTotal + priceDecor;

        if (priceTotal > budget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", Math.abs(priceTotal - budget));
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", Math.abs(budget - priceTotal));
        }

    }
}

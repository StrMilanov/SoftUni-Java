package FirstStepsInCoding.Exercises_03;

import java.util.Scanner;

public class A04_FishingBoat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermanAmount = Integer.parseInt(scanner.nextLine());

        double boatPrice = 0;

        switch (season) {
            case "Spring":
                boatPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                break;
            case "Winter":
                boatPrice = 2600;
                break;
        }

        if (fishermanAmount <= 6) {
            boatPrice -= boatPrice * 0.1;
        } else if (fishermanAmount <= 11) {
            boatPrice -= boatPrice * 0.15;
        } else if (fishermanAmount > 12) {
            boatPrice -= boatPrice * 0.25;
        }


        if (fishermanAmount % 2 == 0 && !season.equals("Autumn")) {
            boatPrice -= boatPrice * 0.05;
        }

        if (budget >= boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - boatPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", boatPrice - budget);
        }

    }
}

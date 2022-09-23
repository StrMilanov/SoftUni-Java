package FirstStepsInCoding.Exercises_03;

import java.util.Scanner;

public class A03_NewHouse_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerAmount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double priceRoses = 5;
        double priceDahlias = 3.80;
        double priceTulips = 2.80;
        double priceNarcissus = 3;
        double priceGladiolus = 2.50;
        double priceTotal = 0;

        switch (flowerType) {
            case "Roses":
                priceTotal = flowerAmount * priceRoses;
                if (flowerAmount > 80) {
                    priceTotal -= priceTotal * 0.1;
                }
                break;
            case "Dahlias":
                priceTotal = flowerAmount * priceDahlias;
                if (flowerAmount > 90) {
                    priceTotal -= priceTotal * 0.15;
                }
                break;
            case "Tulips":
                priceTotal = flowerAmount * priceTulips;
                if (flowerAmount > 80) {
                    priceTotal -= priceTotal * 0.15;
                }
                break;
            case "Narcissus":
                priceTotal = flowerAmount * priceNarcissus;
                if (flowerAmount < 120) {
                    priceTotal += priceTotal * 0.15;
                }
                break;
            case "Gladiolus":
                priceTotal = flowerAmount * priceGladiolus;
                if (flowerAmount < 80) {
                    priceTotal += priceTotal * 0.2;
                }
                break;
        }

        if (priceTotal <= budget) {
            System.out.printf("Hey, you have a great garden with %s %s and %.2f leva left."
                    , flowerAmount, flowerType, budget - priceTotal);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more."
                    ,priceTotal - budget);
        }

    }
}

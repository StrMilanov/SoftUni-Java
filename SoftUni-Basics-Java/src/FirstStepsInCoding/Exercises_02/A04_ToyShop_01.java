package FirstStepsInCoding.Exercises_02;

import java.util.Scanner;

public class A04_ToyShop_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTrip = Double.parseDouble(scanner.nextLine());
        int amountPuzzle = Integer.parseInt(scanner.nextLine());
        int amountDoll = Integer.parseInt(scanner.nextLine());
        int amountTeddy = Integer.parseInt(scanner.nextLine());
        int amountMinion = Integer.parseInt(scanner.nextLine());
        int amountTruck = Integer.parseInt(scanner.nextLine());

        double pricePuzzle = 2.60;
        double priceDoll = 3;
        double priceTeddy = 4.10;
        double priceMinion = 8.20;
        double priceTruck = 2;

        int amountTotal = amountPuzzle + amountDoll + amountTeddy + amountMinion + amountTruck;
        double priceTotal = amountPuzzle * pricePuzzle + amountDoll * priceDoll + amountTeddy * priceTeddy + amountMinion * priceMinion + amountTruck * priceTruck;

        if (amountTotal >= 50) {
            priceTotal -= priceTotal * 0.25;
        }

        double cashLeft = priceTotal - priceTotal * 0.1;

        if (cashLeft >= priceTrip) {
            System.out.printf("Yes! %.2f lv left.", cashLeft - priceTrip);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(cashLeft - priceTrip));
        }
    }
}

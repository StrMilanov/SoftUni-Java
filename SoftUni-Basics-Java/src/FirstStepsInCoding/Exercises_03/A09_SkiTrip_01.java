package FirstStepsInCoding.Exercises_03;

import java.util.Scanner;

public class A09_SkiTrip_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();

        double priceSingleRoom = 18;
        double priceApartment = 25;
        double pricePresident = 35;
        double discount = 0;
        double priceTotal = 0;

        int nights = days - 1;


        if (days < 10) {
            switch (roomType) {
                case "room for one person":
                    discount = 0;
                    break;
                case "apartment":
                    discount = 0.3;
                    break;
                case "president apartment":
                    discount = 0.1;
                    break;
            }
        } else if (days <= 15) {
            switch (roomType) {
                case "room for one person":
                    discount = 0;
                    break;
                case "apartment":
                    discount = 0.35;
                    break;
                case "president apartment":
                    discount = 0.15;
                    break;
            }
        } else {
            switch (roomType) {
                case "room for one person":
                    discount = 0;
                    break;
                case "apartment":
                    discount = 0.5;
                    break;
                case "president apartment":
                    discount = 0.2;
                    break;
            }
        }

        switch (roomType) {
            case "room for one person":
                priceTotal = (nights * priceSingleRoom) - nights * priceSingleRoom * discount;
                break;
            case "apartment":
                priceTotal = (nights * priceApartment) - nights * priceApartment * discount;
                break;
            case "president apartment":
                priceTotal = (nights * pricePresident) - nights * pricePresident * discount;
                break;
        }

        switch (review) {
            case "positive":
                priceTotal += priceTotal * 0.25;
                break;
            case "negative":
                priceTotal -= priceTotal * 0.1;
                break;
        }

        System.out.printf("%.2f", priceTotal);
    }
}

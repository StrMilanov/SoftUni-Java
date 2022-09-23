package FirstStepsInCoding.Exercises_03;

import java.util.Scanner;

public class A07_HotelRoom_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApartment = 0;
        double totalStudio = 0;
        double totalApartment = 0;

        switch (month) {
            case "May":
            case "October":
                priceStudio = 50;
                priceApartment = 65;
                if (nights > 7 && nights <= 14) {
                    priceStudio -= priceStudio * 0.05;
                } else if (nights > 14) {
                    priceStudio -= priceStudio * 0.3;
                }
                break;
            case "June":
            case "September":
                priceStudio = 75.20;
                priceApartment = 68.70;
                if (nights > 14) {
                    priceStudio -= priceStudio * 0.2;
                }
                break;
            case "July":
            case "August":
                priceStudio = 76;
                priceApartment = 77;
                break;
        }

        if (nights > 14) {
            priceApartment -= priceApartment * 0.1;
        }

        totalStudio = priceStudio * nights;
        totalApartment = priceApartment * nights;

        System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", totalApartment, totalStudio);

    }
}

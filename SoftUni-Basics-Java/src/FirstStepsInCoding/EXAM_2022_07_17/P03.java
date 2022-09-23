package FirstStepsInCoding.EXAM_2022_07_17;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceRoomOnePerson = 18.00;
        double priceApartment = 25.00;
        double pricePresidentAp = 35.00;
        double totalPrice = 0;

        int days = Integer.parseInt(scanner.nextLine());
        int nights = days - 1;
        String typeOfRoom = scanner.nextLine();
        String review = scanner.nextLine();

        switch (typeOfRoom) {
            case "room for one person":
                totalPrice = priceRoomOnePerson * nights;
                break;
            case "apartment":
                totalPrice = priceApartment * nights;
                if (nights < 10) {
                    totalPrice -= totalPrice * 0.3;
                } else if (nights <= 15) {
                    totalPrice -= totalPrice * 0.35;
                } else {
                    totalPrice -= totalPrice * 0.5;
                }
                break;
            case "president apartment":
                totalPrice = pricePresidentAp * nights;
                if (nights < 10) {
                    totalPrice -= totalPrice * 0.1;
                } else if (nights <= 15) {
                    totalPrice -= totalPrice * 0.15;
                } else {
                    totalPrice -= totalPrice * 0.2;
                }
                break;
        }

        switch (review) {
            case "positive":
                totalPrice += totalPrice * 0.25;
                break;
            case "negative":
                totalPrice -= totalPrice * 0.1;
                break;
        }

        System.out.printf("%.2f", totalPrice);

    }
}

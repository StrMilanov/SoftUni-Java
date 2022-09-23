package FirstStepsInCoding.TestExam_April2019;

import java.util.Scanner;

public class P03_EasterTrip_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int amountNights = Integer.parseInt(scanner.nextLine());

        double pricePerNight = 0;

        switch (dates) {
            case "21-23":
                if (destination.equals("France")) {
                    pricePerNight = 30;
                }
                if (destination.equals("Italy")) {
                    pricePerNight = 28;
                }
                if (destination.equals("Germany")) {
                    pricePerNight = 32;
                }
                break;
            case "24-27":
                if (destination.equals("France")) {
                    pricePerNight = 35;
                }
                if (destination.equals("Italy")) {
                    pricePerNight = 32;
                }
                if (destination.equals("Germany")) {
                    pricePerNight = 37;
                }
                break;
            case "28-31":
                if (destination.equals("France")) {
                    pricePerNight = 40;
                }
                if (destination.equals("Italy")) {
                    pricePerNight = 39;
                }
                if (destination.equals("Germany")) {
                    pricePerNight = 43;
                }
                break;
        }

        System.out.printf("Easter trip to %s : %.2f leva.", destination, pricePerNight * amountNights);

    }
}

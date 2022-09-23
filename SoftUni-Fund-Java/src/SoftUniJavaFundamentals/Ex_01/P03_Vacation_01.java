package SoftUniJavaFund.Ex_01;

import java.util.Scanner;

public class P03_Vacation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double ticketPrice = 0;
        double totalPrice = 0;

        switch (groupType) {
            case "Students":
                if (day.equals("Friday")) {
                    ticketPrice = 8.45;
                    totalPrice = ticketPrice * people;
                    if (people >= 30){
                        totalPrice -= totalPrice*0.15;
                    }
                } else if (day.equals("Saturday")) {
                    ticketPrice = 9.80;
                    totalPrice = ticketPrice * people;
                    if (people >= 30){
                        totalPrice -= totalPrice*0.15;
                    }
                } else if (day.equals("Sunday")) {
                    ticketPrice = 10.46;
                    totalPrice = ticketPrice * people;
                    if (people >= 30){
                        totalPrice -= totalPrice*0.15;
                    }
                }
                break;

            case "Business":
                if (day.equals("Friday")) {
                    ticketPrice = 10.90;
                    if (people >= 100){
                        people -= 10;
                    }
                    totalPrice = ticketPrice * people;
                } else if (day.equals("Saturday")) {
                    ticketPrice = 15.60;
                    if (people >= 100){
                        people -= 10;
                    }
                    totalPrice = ticketPrice * people;
                } else if (day.equals("Sunday")) {
                    ticketPrice = 16;
                    if (people >= 100){
                        people -= 10;
                    }
                    totalPrice = ticketPrice * people;
                }
                break;

            case "Regular":
                if (day.equals("Friday")) {
                    ticketPrice = 15;
                    totalPrice = ticketPrice * people;
                    if (people >= 10 && people <= 20){
                        totalPrice -= totalPrice * 0.05;
                    }
                } else if (day.equals("Saturday")) {
                    ticketPrice = 20;
                    totalPrice = ticketPrice * people;
                    if (people >= 10 && people <= 20){
                        totalPrice -= totalPrice * 0.05;
                    }
                } else if (day.equals("Sunday")) {
                    ticketPrice = 22.50;
                    totalPrice = ticketPrice * people;
                    if (people >= 10 && people <= 20){
                        totalPrice -= totalPrice * 0.05;
                    }
                }
                break;
        }

        System.out.printf("Total price: %.2f", totalPrice);

    }
}

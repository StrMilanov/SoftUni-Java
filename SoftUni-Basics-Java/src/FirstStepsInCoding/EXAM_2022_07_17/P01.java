package FirstStepsInCoding.EXAM_2022_07_17;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerNight = 20;
        double priceTravelCard = 1.60;
        double priceTicket = 6;

        int amountPeople = Integer.parseInt(scanner.nextLine());
        int amountNights = Integer.parseInt(scanner.nextLine());
        int amountTravelCards = Integer.parseInt(scanner.nextLine());
        int amountTickets = Integer.parseInt(scanner.nextLine());

        double totalNights = pricePerNight * amountNights;
        double totalTravelCards = priceTravelCard * amountTravelCards;
        double totalTickets = amountTickets * priceTicket;

        double totalPerPerson = totalNights + totalTravelCards + totalTickets;
        double totalAll = totalPerPerson * amountPeople;
        double total =totalAll + totalAll * 0.25;

        System.out.printf("%.2f", total);
    }
}

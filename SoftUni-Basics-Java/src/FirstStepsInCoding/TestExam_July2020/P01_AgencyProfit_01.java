package FirstStepsInCoding.TestExam_July2020;

import java.util.Scanner;

public class P01_AgencyProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameAirline = scanner.nextLine();
        int amountAdultTickets = Integer.parseInt(scanner.nextLine());
        int amountChildTickets = Integer.parseInt(scanner.nextLine());
        double priceAdultTicket = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double priceChildTicket = priceAdultTicket - priceAdultTicket * 0.7;

        double total = (tax + priceAdultTicket) * amountAdultTickets + (tax + priceChildTicket) * amountChildTickets;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", nameAirline, total * 0.2);

    }
}

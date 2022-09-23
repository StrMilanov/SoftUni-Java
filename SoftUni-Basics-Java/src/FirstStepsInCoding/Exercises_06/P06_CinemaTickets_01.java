package FirstStepsInCoding.Exercises_06;

import java.util.Scanner;

public class P06_CinemaTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameMovie = ";";
        int freeSeats = 0;
        int counterStudent = 0;
        int counterStandard = 0;
        int counterKid = 0;
        int currentTotalTickets = 0;
        int totalStudentTickets = 0;
        int totalStandardTickets = 0;
        int totalKidTickets = 0;
        int totalTickets = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            nameMovie = input;
            freeSeats = Integer.parseInt(scanner.nextLine());

            String ticket = scanner.nextLine();
            while (!ticket.equals("End")) {
                switch (ticket) {
                    case "student":
                        counterStudent++;
                        currentTotalTickets++;
                        break;
                    case "standard":
                        counterStandard++;
                        currentTotalTickets++;
                        break;
                    case "kid":
                        counterKid++;
                        currentTotalTickets++;
                        break;
                }
                if (freeSeats == currentTotalTickets){
                    break;
                }
                ticket = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.\n", nameMovie, 1.0 * currentTotalTickets / freeSeats * 100);

            totalTickets += currentTotalTickets;
            totalStudentTickets += counterStudent;
            totalStandardTickets += counterStandard;
            totalKidTickets += counterKid;

            currentTotalTickets = 0;
            counterStudent = 0;
            counterStandard = 0;
            counterKid = 0;

            input = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", 1.0 * totalStudentTickets / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", 1.0 * totalStandardTickets / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.\n", 1.0 * totalKidTickets / totalTickets * 100);
    }
}

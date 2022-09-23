package FirstStepsInCoding.Exercises_03;

import java.util.Scanner;

public class A05_Journey_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double cost = 0;
        String destination = "";
        String accommodation = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    accommodation = "Camp";
                    cost = budget * 0.3;
                    break;
                case "winter":
                    accommodation = "Hotel";
                    cost = budget * 0.7;
                    break;
            }

        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    accommodation = "Camp";
                    cost = budget * 0.4;
                    break;
                case "winter":
                    accommodation = "Hotel";
                    cost = budget * 0.8;
                    break;
            }

        } else {
            destination = "Europe";
            accommodation = "Hotel";
            cost = budget * 0.9;
        }

        System.out.printf("Somewhere in %s%n%s - %.2f", destination, accommodation, cost);
    }
}

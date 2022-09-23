package FirstStepsInCoding.TestExam_July2020;

import java.util.Scanner;

public class P04_Balls_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int totalPoints = 0;
        int counterRed = 0;
        int counterOrange = 0;
        int counterYellow = 0;
        int counterWhite = 0;
        int counterBlack = 0;
        int counterOther = 0;

        for (int i = 1; i <= n; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    counterRed++;
                    totalPoints += 5;
                    break;
                case "orange":
                    counterOrange++;
                    totalPoints += 10;
                    break;
                case "yellow":
                    counterYellow++;
                    totalPoints += 15;
                    break;
                case "white":
                    counterWhite++;
                    totalPoints += 20;
                    break;
                case "black":
                    counterBlack++;
                    totalPoints = totalPoints / 2;          // Possible issue
                    break;

                default:
                    counterOther++;
                    break;
            }
        }

        System.out.println("Total points: " + totalPoints);
        System.out.println("Red balls: " + counterRed);
        System.out.println("Orange balls: " + counterOrange);
        System.out.println("Yellow balls: " + counterYellow);
        System.out.println("White balls: " + counterWhite);
        System.out.println("Other colors picked: " + counterOther);
        System.out.println("Divides from black balls: " + counterBlack);

    }
}

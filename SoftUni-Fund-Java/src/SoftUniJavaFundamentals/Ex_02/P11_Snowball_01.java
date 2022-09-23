package SoftUniJavaFundamentals.Ex_02;

import java.util.Scanner;

public class P11_Snowball_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballSnowBest = 0;
        int snowballTimeBest = 0;
        int snowballQualityBest = 0;
        double snowballValueBest = Double.MIN_VALUE;

        int amountSnowballs = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= amountSnowballs; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((1.0 * snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > snowballValueBest) {
                snowballSnowBest = snowballSnow;
                snowballTimeBest = snowballTime;
                snowballQualityBest = snowballQuality;
                snowballValueBest = snowballValue;
            }

        }

        System.out.printf("%d : %d = %.0f (%d)",
                snowballSnowBest, snowballTimeBest, snowballValueBest, snowballQualityBest);

    }
}

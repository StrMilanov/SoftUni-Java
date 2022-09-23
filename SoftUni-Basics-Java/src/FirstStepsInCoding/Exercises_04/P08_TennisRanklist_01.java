package FirstStepsInCoding.Exercises_04;

import java.util.Scanner;

public class P08_TennisRanklist_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountMatch = Integer.parseInt(scanner.nextLine());
        int pointsStart = Integer.parseInt(scanner.nextLine());

        int pointsTotal = 0;
        double pointsMean = 0;
        int counterWin = 0;
        double percentWinRate = 0;

        for (int i = 1; i <= amountMatch; i++) {
            String achievement = scanner.nextLine();
            switch (achievement) {
                case "W":
                    pointsTotal += 2000;
                    counterWin++;
                    break;
                case "F":
                    pointsTotal += 1200;
                    break;
                case "SF":
                    pointsTotal += 720;
                    break;
            }
        }

        pointsMean = 1.0 * pointsTotal / amountMatch;
        pointsTotal += pointsStart;
        percentWinRate = 1.0 * counterWin / amountMatch * 100;

        System.out.printf("Final points: %d\n", pointsTotal);
        System.out.printf("Average points: %.0f\n", Math.floor(pointsMean));
        System.out.printf("%.2f%%", percentWinRate);

    }
}

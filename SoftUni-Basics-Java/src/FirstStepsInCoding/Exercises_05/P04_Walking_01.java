package FirstStepsInCoding.Exercises_05;

import java.util.Scanner;

public class P04_Walking_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stepsGoal = 10000;
        int stepsTotal = 0;
        boolean isFailed = false;

        while (stepsTotal < stepsGoal) {
            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                stepsTotal += stepsToHome;
                if (stepsTotal < stepsGoal) {
                    isFailed = true;
                }
                break;
            }

            int steps = Integer.parseInt(input);
            stepsTotal += steps;
        }

        if (isFailed) {
            System.out.printf("%d more steps to reach goal.", stepsGoal - stepsTotal);
        } else {
            System.out.printf("Goal reached! Good job!\n%d steps over the goal!", stepsTotal - stepsGoal);
        }
    }
}


package FirstStepsInCoding.Exercises_05;

import java.util.Scanner;

public class P02_ExamPreparation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxBadGrades = Integer.parseInt(scanner.nextLine());
        int counterGrades = 0;
        int counterBadGrades = 0;
        boolean tooManyBadGrades = false;
        double totalGrades = 0;
        String problemName = "";
        int problemGrade = 0;

        String input = scanner.nextLine();
        while (!input.equals("Enough")) {
            problemName = input;
            input = scanner.nextLine();
            problemGrade = Integer.parseInt(input);
            counterGrades++;

            if (problemGrade <= 4) {
                counterBadGrades++;
            }
            if (counterBadGrades == maxBadGrades) {
                tooManyBadGrades = true;
                break;
            }

            totalGrades += problemGrade;

            input = scanner.nextLine();
        }

        if (tooManyBadGrades) {
            System.out.printf("You need a break, %d poor grades.", counterBadGrades);
        } else {
            System.out.printf("Average score: %.2f\nNumber of problems: %d\nLast problem: %s"
                    ,totalGrades / counterGrades, counterGrades, problemName);
        }

    }
}

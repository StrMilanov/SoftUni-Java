package FirstStepsInCoding.Lab_05;

import java.util.Scanner;

public class P08_Graduation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double currentGrade = 0;
        double totalGrade = 0;
        double avgGrade = 0;
        int counterGoodGrades = 0;
        int counterBadGrades = 0;
        int counterGrades = 1;

        while (counterGoodGrades < 12) {
            if (counterBadGrades == 2) {
                break;
            }

            currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade < 4.00) {
                counterBadGrades++;
                continue;
            }

            totalGrade += currentGrade;
            counterGoodGrades++;
            counterGrades++;
        }

        if (counterBadGrades == 2) {
            System.out.printf("%s has been excluded at %d grade", name, counterGrades);
        } else {
            avgGrade = totalGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);
        }

    }
}

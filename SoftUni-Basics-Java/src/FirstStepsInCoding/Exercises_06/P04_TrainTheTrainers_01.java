package FirstStepsInCoding.Exercises_06;

import java.util.Scanner;

public class P04_TrainTheTrainers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryAmount = Integer.parseInt(scanner.nextLine());

        String name = ";";
        double currentGrade = 0;
        double sumGrades = 0;
        double finalAvgGrade = 0;
        double totalAvgGrade = 0;
        int counterP = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            name = input;

            for (int j = 1; j <= juryAmount; j++) {
                currentGrade = Double.parseDouble(scanner.nextLine());
                sumGrades += currentGrade;
            }

            double avgGrade = sumGrades / juryAmount;
            System.out.printf("%s - %.2f.\n", name, avgGrade);

            totalAvgGrade += avgGrade;
            counterP++;
            sumGrades = 0;

            input = scanner.nextLine();
        }

        finalAvgGrade = totalAvgGrade / counterP;
        System.out.printf("Student's final assessment is %.2f.", finalAvgGrade);
    }
}

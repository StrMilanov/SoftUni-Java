package FirstStepsInCoding.TestExam_March2020;

import java.util.Scanner;

public class P02_CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int walks = Integer.parseInt(scanner.nextLine());
        int TotalCalories = Integer.parseInt(scanner.nextLine());

        int calsPerMin = 5;
        int totalMinutes = walks * minutes;

        if (calsPerMin * totalMinutes >= TotalCalories / 2) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", calsPerMin * totalMinutes);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", calsPerMin * totalMinutes);
        }

    }
}

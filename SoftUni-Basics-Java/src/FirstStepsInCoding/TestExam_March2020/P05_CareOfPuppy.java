package FirstStepsInCoding.TestExam_March2020;

import java.util.Scanner;

public class P05_CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalFoodKg = Integer.parseInt(scanner.nextLine());
        int totalFoodGr = totalFoodKg * 1000;
        int totalFoodEaten = 0;
        int foodPerDay = 0;

        String input = scanner.nextLine();
        while (!input.equals("Adopted")) {
            foodPerDay = Integer.parseInt(input);
            totalFoodEaten += foodPerDay;

            input = scanner.nextLine();
        }

        if (totalFoodEaten > totalFoodGr){
            System.out.printf("Food is not enough. You need %d grams more.", totalFoodEaten - totalFoodGr);
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.", totalFoodGr - totalFoodEaten);
        }

    }
}

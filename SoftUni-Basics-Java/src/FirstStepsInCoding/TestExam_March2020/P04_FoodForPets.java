package FirstStepsInCoding.TestExam_March2020;

import java.util.Scanner;

public class P04_FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodDog = 0;
        int foodCat = 0;
        int totalFoodDog = 0;
        int totalFoodCat = 0;
        int totalFoodEaten = 0;
        double totalBiscuitsDog = 0;
        double totalBiscuitsCat = 0;
        double totalBiscuits = 0;

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        for (int i = 1; i <= days; i++) {
            foodDog = Integer.parseInt(scanner.nextLine());
            foodCat = Integer.parseInt(scanner.nextLine());

            totalFoodDog += foodDog;
            totalFoodCat += foodCat;

            if (i % 3 == 0) {
                totalBiscuitsDog += foodDog * 0.1;
                totalBiscuitsCat += foodCat * 0.1;
            }
        }

        totalBiscuits = totalBiscuitsDog + totalBiscuitsCat;
        totalFoodEaten = totalFoodDog + totalFoodCat;

        double pTotal = 1.0 * totalFoodEaten / totalFood * 100;
        double pDog = 1.0 * totalFoodDog / totalFoodEaten * 100;
        double pCat = 1.0 * totalFoodCat / totalFoodEaten * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.\n", totalBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.\n", pTotal);
        System.out.printf("%.2f%% eaten from the dog.\n", pDog);
        System.out.printf("%.2f%% eaten from the cat.\n", pCat);

    }
}

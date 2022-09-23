package FirstStepsInCoding.Lab_01;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceDogFood = 2.50;
        double priceCatFood = 4;

        int numDogFood = Integer.parseInt(scan.nextLine());
        int numCatFood = Integer.parseInt(scan.nextLine());

        double totalCost = numDogFood * priceDogFood + numCatFood * priceCatFood;

        System.out.printf("%f lv.", totalCost);

    }
}

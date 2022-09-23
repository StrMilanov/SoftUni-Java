package FirstStepsInCoding.Exercises_01;

import java.util.Scanner;

public class A07_FoodDelivery_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceChicken = 10.35;
        double priceFish = 12.40;
        double priceVegetarian = 8.15;
        double priceShipping = 2.50;

        int amountChicken = Integer.parseInt(scanner.nextLine());
        int amountFish = Integer.parseInt(scanner.nextLine());
        int amountVegetarian = Integer.parseInt(scanner.nextLine());

        double totalMainCourse = amountChicken * priceChicken + amountFish * priceFish + amountVegetarian * priceVegetarian;
        double totalDessert = totalMainCourse * 20/100;

        double totalOrder = totalMainCourse + totalDessert + priceShipping;

        System.out.println(totalOrder);
    }
}

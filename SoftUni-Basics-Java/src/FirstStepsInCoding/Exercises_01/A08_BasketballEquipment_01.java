package FirstStepsInCoding.Exercises_01;

import java.util.Scanner;

public class A08_BasketballEquipment_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pricePerYear = Integer.parseInt(scanner.nextLine());

        double priceSneakers = pricePerYear - pricePerYear * 40/100.00;
        double priceOutfit = priceSneakers - priceSneakers * 20/100.00;
        double priceBasketball = priceOutfit / 4;
        double priceAccessories = priceBasketball / 5;

        System.out.println(pricePerYear + priceSneakers + priceOutfit + priceBasketball +priceAccessories);
    }

}

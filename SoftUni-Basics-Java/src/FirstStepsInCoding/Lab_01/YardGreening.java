package FirstStepsInCoding.Lab_01;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceSqMet = 7.61;
        double discount = 0.18;

        double landSqMet = Double.parseDouble(scan.nextLine());

        double priceMain = landSqMet * priceSqMet;
        double priceDiscount = priceMain * discount;
        double priceFinal = priceMain - priceDiscount;

        System.out.printf("The final price is: %f lv.\n", priceFinal);
        System.out.printf("The discount is: %f lv.", priceDiscount);

    }
}

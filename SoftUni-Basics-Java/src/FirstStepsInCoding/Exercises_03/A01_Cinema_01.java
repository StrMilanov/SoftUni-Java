package FirstStepsInCoding.Exercises_03;


import java.util.Scanner;

public class A01_Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rowAmount = Integer.parseInt(scanner.nextLine());
        int columnAmount = Integer.parseInt(scanner.nextLine());

        double pricePremiere = 12;
        double priceNormal = 7.50;
        double priceDiscount = 5;

        int seatsTotal = rowAmount * columnAmount;
        double priceTotal = 0;

        switch (type) {
            case "Premiere":
                priceTotal = seatsTotal * pricePremiere;
                break;
            case "Normal":
                priceTotal = seatsTotal * priceNormal;
                break;
            case "Discount":
                priceTotal = seatsTotal * priceDiscount;
                break;
        }

        System.out.printf("%.2f leva", priceTotal);

    }
}

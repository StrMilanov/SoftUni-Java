package FirstStepsInCoding.EXAM_2022_07_17;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceLoveLetter = 0.60;
        double priceWaxRose = 7.20;
        double priceKeychain = 3.60;
        double priceCaricature = 18.20;
        double priceSurprise = 22.00;
        double total = 0;

        double priceParty = Double.parseDouble(scanner.nextLine());
        int amountLoveLetters = Integer.parseInt(scanner.nextLine());
        int amountWaxRose = Integer.parseInt(scanner.nextLine());
        int amountKeychain = Integer.parseInt(scanner.nextLine());
        int amountCaricature = Integer.parseInt(scanner.nextLine());
        int amountSurprise = Integer.parseInt(scanner.nextLine());

        int totalItems = amountLoveLetters + amountWaxRose + amountCaricature + amountKeychain + amountSurprise;
        total = amountLoveLetters * priceLoveLetter + amountWaxRose * priceWaxRose + amountKeychain * priceKeychain + amountCaricature * priceCaricature + amountSurprise * priceSurprise;

        if (totalItems >= 25) {
            total -= total * 0.35;
        }

        double totalAfterTax = total -= total * 0.1;


        if (totalAfterTax >= priceParty) {
            System.out.printf("Yes! %.2f lv left.", totalAfterTax - priceParty);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceParty - totalAfterTax);
        }

    }
}

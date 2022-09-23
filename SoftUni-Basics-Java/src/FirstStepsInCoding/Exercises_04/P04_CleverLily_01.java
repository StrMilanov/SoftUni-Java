package FirstStepsInCoding.Exercises_04;

import java.util.Scanner;

public class P04_CleverLily_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        int amountToys = 0;
        double giftMoney = 0;
        double priceToysTotal = 0;
        double moneyTotal = 0;
        double cashTotal = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                giftMoney += 10;
                moneyTotal += giftMoney;
                moneyTotal -= 1;
            } else {
                amountToys++;
            }
        }

        priceToysTotal = priceToy * amountToys;
        cashTotal = moneyTotal + priceToysTotal;

        if (cashTotal >= priceWMachine) {
            System.out.printf("Yes! %.2f", cashTotal - priceWMachine);
        } else {
            System.out.printf("No! %.2f", priceWMachine - cashTotal);
        }

    }
}

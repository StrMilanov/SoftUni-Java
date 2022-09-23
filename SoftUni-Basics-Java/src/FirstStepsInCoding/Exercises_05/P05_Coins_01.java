package FirstStepsInCoding.Exercises_05;

import java.util.Scanner;

public class P05_Coins_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counterCoins = 0;

        double changeDouble = Double.parseDouble(scanner.nextLine());
        double change = Math.round(changeDouble * 100);

        while (change > 0) {
            if (change >= 200) {
                change -= 200;
            } else if (change >= 100) {
                change -= 100;
            } else if (change >= 50) {
                change -= 50;
            } else if (change >= 20) {
                change -= 20;
            } else if (change >= 10) {
                change -= 10;
            } else if (change >= 5) {
                change -= 5;
            } else if (change >= 2) {
                change -= 2;
            } else if (change >= 1) {
                change -= 1;
            }

            counterCoins++;
        }

        System.out.println(counterCoins);

    }
}

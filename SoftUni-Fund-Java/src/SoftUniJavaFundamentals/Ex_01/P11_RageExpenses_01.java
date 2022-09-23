package SoftUniJavaFund.Ex_01;

import java.util.Scanner;

public class P11_RageExpenses_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int totalHeadsets = lostGamesCount / 2;
        int totalMouses = lostGamesCount / 3;
        int totalKeyboards = lostGamesCount / 6;
        int totalDisplays = lostGamesCount / 12;

        double total = headsetPrice * totalHeadsets
                + mousePrice * totalMouses
                + keyboardPrice * totalKeyboards
                + displayPrice * totalDisplays;

        System.out.printf("Rage expenses: %.2f lv.", total);

    }
}

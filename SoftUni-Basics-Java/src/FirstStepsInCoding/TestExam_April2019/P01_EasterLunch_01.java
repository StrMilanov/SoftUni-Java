package FirstStepsInCoding.TestExam_April2019;

import java.util.Scanner;

public class P01_EasterLunch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountEasterBread = Integer.parseInt(scanner.nextLine());
        int amountEggCarton = Integer.parseInt(scanner.nextLine());
        int amountCookiesKg = Integer.parseInt(scanner.nextLine());

        double priceEasterBread = 3.2;
        double priceEggCarton = 4.35;       // 12 eggs
        double priceCookies = 5.4;
        double priceEggPaint = 0.15;        // per egg

        double totalCostEggs = priceEggCarton * amountEggCarton + priceEggPaint * amountEggCarton * 12;
        double totalCostCookies = priceCookies * amountCookiesKg;
        double totalEasterBread = amountEasterBread * priceEasterBread;

        double totalCostAll = totalCostEggs + totalCostCookies + totalEasterBread;

        System.out.printf("%.2f", totalCostAll);

    }
}

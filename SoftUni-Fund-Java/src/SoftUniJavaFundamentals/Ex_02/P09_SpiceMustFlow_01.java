package SoftUniJavaFundamentals.Ex_02;

import java.util.Scanner;

public class P09_SpiceMustFlow_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDays = 0;
        int totalSpiceGathered = 0;

        int yieldPerDay = Integer.parseInt(scanner.nextLine());
        while (yieldPerDay >= 100) {

            countDays++;
            totalSpiceGathered += yieldPerDay;

            // Feed miners daily
            if (totalSpiceGathered >= 26) {
                totalSpiceGathered -= 26;
            } else {
                totalSpiceGathered = 0;
            }

            yieldPerDay -= 10;
        }

        // Feed miners at end
        if (totalSpiceGathered >= 26) {
            totalSpiceGathered -= 26;
        } else {
            totalSpiceGathered = 0;
        }

        System.out.println(countDays);
        System.out.println(totalSpiceGathered);

    }
}

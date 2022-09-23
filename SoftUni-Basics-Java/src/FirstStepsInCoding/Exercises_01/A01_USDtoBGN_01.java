package FirstStepsInCoding.Exercises_01;

import java.util.Scanner;

public class A01_USDtoBGN_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rateUSDToBGN = 1.79549;

        double usd = Double.parseDouble(scanner.nextLine());

        System.out.println(usd * rateUSDToBGN);

    }
}

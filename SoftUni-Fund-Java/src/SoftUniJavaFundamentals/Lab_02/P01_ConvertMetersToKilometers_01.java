package SoftUniJavaFundamentals.Lab_02;

import java.util.Scanner;

public class P01_ConvertMetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int metres = Integer.parseInt(scanner.nextLine());

        double kilometers = metres / 1000.0;

        System.out.printf("%.2f", kilometers);
    }
}

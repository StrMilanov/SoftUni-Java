package SoftUniJavaFundamentals.Lab_02;

import java.math.BigDecimal;
import java.util.Scanner;

public class P02_PoundsToDollars_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double britishPounds = Double.parseDouble(scanner.nextLine());

        double usDollars = britishPounds * 1.36;

        System.out.printf("%.3f",usDollars);

    }
}

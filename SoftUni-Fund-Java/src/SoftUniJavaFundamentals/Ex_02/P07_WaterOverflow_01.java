package SoftUniJavaFundamentals.Ex_02;

import java.util.Scanner;

public class P07_WaterOverflow_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int totalCapacity = 255;
        int totalFill = 0;

        for (int i = 1; i <= n; i++) {
            int nextInput = Integer.parseInt(scanner.nextLine());

            if (nextInput > totalCapacity - totalFill) {
                System.out.println("Insufficient capacity!");
            } else {
                totalFill += nextInput;
            }
        }

        System.out.println(totalFill);

    }
}

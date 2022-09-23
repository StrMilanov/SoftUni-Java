package FirstStepsInCoding.Exercises_02;

import java.util.Scanner;

public class A07_Shopping_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numGPU = Integer.parseInt(scanner.nextLine());
        int numProcessor = Integer.parseInt(scanner.nextLine());
        int numRAM = Integer.parseInt(scanner.nextLine());

        double priceGPU = 250;
        double priceProcessor = numGPU * priceGPU * 0.35;
        double priceRAM = numGPU * priceGPU * 0.1;

        double total = numGPU * priceGPU + numProcessor * priceProcessor + numRAM * priceRAM;
        if (numGPU > numProcessor) {
            total -= total * 0.15;
        }

        if (total <= budget) {
            System.out.printf("You have %.2f leva left!", budget - total);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", total - budget);
        }
    }
}

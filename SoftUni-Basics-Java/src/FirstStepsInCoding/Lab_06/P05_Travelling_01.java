package FirstStepsInCoding.Lab_06;

import java.util.Scanner;

public class P05_Travelling_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = "";
        double priceDestination = 0;
        int sum = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            destination = input;
            priceDestination = Double.parseDouble(scanner.nextLine());

            while (sum < priceDestination) {
                sum += Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("Going to %s!\n", destination);
            sum = 0;

            input = scanner.nextLine();
        }

    }
}

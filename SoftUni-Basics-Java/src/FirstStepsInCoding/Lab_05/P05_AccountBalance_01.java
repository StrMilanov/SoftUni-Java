package FirstStepsInCoding.Lab_05;

import java.util.Scanner;

public class P05_AccountBalance_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        double inputMoney = 0;

        String input = scanner.nextLine();
        while (!input.equals("NoMoreMoney")) {
            inputMoney = Double.parseDouble(input);

            if (inputMoney < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f\n", inputMoney);
            total += inputMoney;

            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", total);

    }
}

package SoftUniJavaFund.Ex_01;

import java.util.Scanner;

public class P07_VendingMachine_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyTotal = 0;
        double nutsPrice = 2.0;
        double waterPrice = 0.7;
        double crispsPrice = 1.5;
        double sodaPrice = 0.8;
        double cokePrice = 1.0;

        String input = scanner.nextLine();
        while (!input.equals("Start")) {
            double coinInput = Double.parseDouble(input);

            if (coinInput == 0.1 || coinInput == 0.2 || coinInput == 0.5 || coinInput == 1 || coinInput == 2) {
                moneyTotal += coinInput;
            } else {
                System.out.printf("Cannot accept %.2f\n", coinInput);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    if (moneyTotal >= nutsPrice) {
                        moneyTotal -= nutsPrice;
                        System.out.printf("Purchased %s\n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (moneyTotal >= waterPrice) {
                        moneyTotal -= waterPrice;
                        System.out.printf("Purchased %s\n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (moneyTotal >= crispsPrice) {
                        moneyTotal -= crispsPrice;
                        System.out.printf("Purchased %s\n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (moneyTotal >= sodaPrice) {
                        moneyTotal -= sodaPrice;
                        System.out.printf("Purchased %s\n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (moneyTotal >= cokePrice) {
                        moneyTotal -= cokePrice;
                        System.out.printf("Purchased %s\n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f\n", moneyTotal);

    }

}


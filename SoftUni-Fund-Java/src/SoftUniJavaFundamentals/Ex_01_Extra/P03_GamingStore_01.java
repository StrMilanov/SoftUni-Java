package SoftUniJavaFund.Ex_01_Extra;

import java.util.Scanner;

public class P03_GamingStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOutFall4 = 39.99;
        double priceCSOG = 15.99;
        double priceZplinterZell = 19.99;
        double priceHonored2 = 59.99;
        double priceRoverWatch = 29.99;
        double priceRoverWatchOE = 39.99;

        double currentBalance = Double.parseDouble(scanner.nextLine());
        double startBalance = currentBalance;

        String input = scanner.nextLine();
        while (!input.equals("Game Time")) {

            switch (input) {
                case "OutFall 4":
                    if (currentBalance >= priceOutFall4) {
                        currentBalance -= priceOutFall4;
                        System.out.printf("Bought %s\n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;

                case "CS: OG":
                    if (currentBalance >= priceCSOG) {
                        currentBalance -= priceCSOG;
                        System.out.printf("Bought %s\n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;

                case "Zplinter Zell":
                    if (currentBalance >= priceZplinterZell) {
                        currentBalance -= priceZplinterZell;
                        System.out.printf("Bought %s\n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;

                case "Honored 2":
                    if (currentBalance >= priceHonored2) {
                        currentBalance -= priceHonored2;
                        System.out.printf("Bought %s\n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;

                case "RoverWatch":
                    if (currentBalance >= priceRoverWatch) {
                        currentBalance -= priceRoverWatch;
                        System.out.printf("Bought %s\n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;

                case "RoverWatch Origins Edition":
                    if (currentBalance >= priceRoverWatchOE) {
                        currentBalance -= priceRoverWatchOE;
                        System.out.printf("Bought %s\n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;

                default:
                    System.out.println("Not Found");
                    break;
            }

            if (currentBalance <= 0) {
                System.out.println("Out of money!");
                return;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", startBalance - currentBalance, currentBalance);

    }
}

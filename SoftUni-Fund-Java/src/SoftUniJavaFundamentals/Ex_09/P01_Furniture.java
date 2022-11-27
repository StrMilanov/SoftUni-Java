package SoftUniJavaFundamentals.Ex_09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<item>[A-Za-z]+)<<(?<price>[\\d.]+)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        double totalSpent = 0;

        String input = scanner.nextLine();

        System.out.println("Bought furniture:");

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                System.out.println(matcher.group("item"));
                double itemPrice = Double.parseDouble(matcher.group("price"));
                int itemQuantity = Integer.parseInt(matcher.group("quantity"));
                totalSpent += itemPrice * itemQuantity;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total money spend: %.2f\n", totalSpent);

    }
}

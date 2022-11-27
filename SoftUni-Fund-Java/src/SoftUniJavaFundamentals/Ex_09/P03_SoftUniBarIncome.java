package SoftUniJavaFundamentals.Ex_09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\%(?<customer>[A-Z][a-z]*)\\%([^\\|\\$\\%\\.]*)*?\\<(?<product>\\w+)\\>([^\\|\\$\\%\\.]*)*?\\|(?<quantity>\\d*)\\|([^\\|\\$\\%\\.]*)*?(?<price>\\d+.?\\d+)\\$";
        Pattern pattern = Pattern.compile(regex);

        double totalIncome = 0;

        String input = scanner.nextLine();
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String name = matcher.group("customer");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));

                System.out.printf("%s: %s - %.2f\n", name, product, quantity * price);

                totalIncome += quantity * price;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", totalIncome);

    }
}

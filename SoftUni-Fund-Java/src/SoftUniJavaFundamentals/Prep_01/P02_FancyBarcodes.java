package SoftUniJavaFundamentals.Prep_01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "(@#+)(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                StringBuilder group = new StringBuilder();
                char[] charArray = matcher.group().toCharArray();
                for (char character : charArray) {
                    if (Character.isDigit(character)) {
                        group.append(character);
                    }
                }

                if (group.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + group);
                }

            } else {
                System.out.println("Invalid barcode");
            }

        }

    }
}

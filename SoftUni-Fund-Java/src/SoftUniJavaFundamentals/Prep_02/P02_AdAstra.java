package SoftUniJavaFundamentals.Prep_02;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int calsTotal = 0;

        StringBuilder itemData = new StringBuilder();

        String regex = "([#|])(?<item>[A-Za-z\\s]+)\\1(?<expDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<cals>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String itemName = matcher.group("item");
            String itemExpDate = matcher.group("expDate");
            int itemCals = Integer.parseInt(matcher.group("cals"));
            calsTotal += itemCals;
            itemData.append(String.format("Item: %s, Best before: %s, Nutrition: %d\n", itemName, itemExpDate, itemCals));
        }

        // DAYS TO LAST - 2000 cals per day
        System.out.printf("You have food to last you for: %d days!\n", calsTotal / 2000);
        System.out.println(itemData);
    }
}

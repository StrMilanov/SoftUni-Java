package SoftUniJavaFundamentals.Exam_Final;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_Exam_EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        String regex = "([@]+|[#]+)(?<color>[a-z]{3,})([@]+|[#]+)([^a-z0-9]*)([/]+)(?<amount>[0-9]+)\\5";
        Pattern pattern = Pattern.compile(regex);

        // FIND EGGS
        Matcher matcher = pattern.matcher(inputString);
        while (matcher.find()) {
            String eggColor = matcher.group("color");
            int eggAmount = Integer.parseInt(matcher.group("amount"));

            System.out.printf("You found %d %s eggs!\n", eggAmount, eggColor);
        }

    }
}

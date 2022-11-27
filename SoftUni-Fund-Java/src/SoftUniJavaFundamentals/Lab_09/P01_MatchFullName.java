package SoftUniJavaFundamentals.Lab_09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "\\b(?<name>[A-Z][a-z]+) (?<lastName>[A-Z][a-z]+)\\b";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }

    }
}

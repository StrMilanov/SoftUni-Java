package SoftUniJavaFundamentals.Lab_08;

import java.util.Scanner;

public class P05_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        String input = scanner.nextLine();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)){
                digits.append(c);
            }else if (Character.isLetter(c)){
                letters.append(c);
            } else {
                symbols.append(c);
            }
        }

        System.out.printf("%s\n%s\n%s\n", digits,letters,symbols);

    }
}

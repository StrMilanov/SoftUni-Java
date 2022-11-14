package SoftUniJavaFundamentals.Ex_08;

import java.util.Scanner;

public class P06_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder letters = new StringBuilder(scanner.nextLine());

        for (int i = 1; i < letters.length(); i++) {
            if (letters.charAt(i) == letters.charAt(i - 1)) {
                letters.deleteCharAt(i);
                i -= 1;
            }
        }

        System.out.println(letters);

    }
}

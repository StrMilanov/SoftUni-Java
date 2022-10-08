package SoftUniJavaFundamentals.Ex_04;

import java.util.Locale;
import java.util.Scanner;

public class P02_VowelsCount_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine().toLowerCase(Locale.ROOT);

        printVowelsCount(textInput);
    }

    private static void printVowelsCount(String text) {
        int vowelsCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                vowelsCount++;
            }
        }
        System.out.println(vowelsCount);
    }

}

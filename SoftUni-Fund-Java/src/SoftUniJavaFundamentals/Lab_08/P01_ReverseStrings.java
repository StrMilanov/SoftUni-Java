package SoftUniJavaFundamentals.Lab_08;

import java.util.Scanner;

public class P01_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputWord = scanner.nextLine();
        while (!inputWord.equals("end")) {
            char[] charArray = inputWord.toCharArray();
            StringBuilder reverseWord = new StringBuilder();

            for (int i = charArray.length - 1; i >= 0; i--) {
                reverseWord.append(inputWord.charAt(i));
            }

            System.out.printf("%s = %s\n", inputWord, reverseWord);

            inputWord = scanner.nextLine();
        }

    }
}

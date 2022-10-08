package SoftUniJavaFundamentals.Ex_04;

import java.util.Scanner;

public class P06_MiddleCharacters_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        printMidChar(textInput);
    }

    public static void printMidChar(String text) {
        if (text.length() % 2 == 0) {
            for (int i = text.length() / 2 - 1; i <= text.length() / 2; i++) {
                System.out.print(text.charAt(i));
            }

        } else {
            System.out.println(text.charAt(text.length() / 2));
        }
    }

}

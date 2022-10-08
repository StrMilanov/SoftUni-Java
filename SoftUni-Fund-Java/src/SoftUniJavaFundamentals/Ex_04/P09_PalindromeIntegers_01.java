package SoftUniJavaFundamentals.Ex_04;

import java.util.Scanner;

public class P09_PalindromeIntegers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")) {

            System.out.println(isNumPalindrome(input));

            input = scanner.nextLine();
        }
    }

    public static boolean isNumPalindrome(String number) {
        boolean isTrue = false;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == number.charAt(number.length() - 1 - i)) {
                isTrue = true;
            } else {
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }

}

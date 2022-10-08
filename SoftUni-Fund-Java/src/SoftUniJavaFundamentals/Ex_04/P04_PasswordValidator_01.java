package SoftUniJavaFundamentals.Ex_04;

import java.util.Scanner;

public class P04_PasswordValidator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (isBetween6And10Long(password) && isOnlyLettersAndDigits(password) && isHas2Digits(password)) {
            System.out.println("Password is valid");
        } else {
            if (!isBetween6And10Long(password)) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!isOnlyLettersAndDigits(password)) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!isHas2Digits(password)) {
                System.out.println("Password must have at least 2 digits");
            }
        }
    }

    public static boolean isBetween6And10Long(String string) {
        if (string.length() >= 6 && string.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOnlyLettersAndDigits(String string) {
        boolean isTrue = true;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 48 && string.charAt(i) <= 57 ||
                    string.charAt(i) >= 65 && string.charAt(i) <= 90 ||
                    string.charAt(i) >= 97 && string.charAt(i) <= 122) {
            } else {
                isTrue = false;
                break;
            }
        }

        return isTrue;
    }

    public static boolean isHas2Digits(String string) {
        int digitsCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 48 && string.charAt(i) <= 57) {
                digitsCount++;
            }
            if (digitsCount == 2) {
                break;
            }
        }

        return digitsCount == 2;
    }

}

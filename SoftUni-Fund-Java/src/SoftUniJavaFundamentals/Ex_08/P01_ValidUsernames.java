package SoftUniJavaFundamentals.Ex_08;

import java.util.Scanner;

public class P01_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namesArr = scanner.nextLine().split(", ");

        for (String name : namesArr) {
            if (name.length() >= 3 && name.length() <= 16 && hasValidContent(name)) {
                System.out.println(name);
            }
        }

    }


    private static boolean hasValidContent(String name) {
        boolean isValid = false;
        for (char c : name.toCharArray()) {
            if (Character.isLetterOrDigit(c) || c == '-' || c == '_'){
                isValid = true;
            } else {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

}

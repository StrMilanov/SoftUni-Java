package SoftUniJavaFundamentals.Ex_08;

import java.util.Scanner;

public class P07_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder inputString = new StringBuilder(scanner.nextLine());
        int strength = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '>' && Character.isDigit(inputString.charAt(i + 1))) {
                strength += Integer.parseInt(inputString.substring(i + 1, i + 2));
            }

            for (int j = strength; j > 0; j--) {
                if (i == inputString.length() - 1) {
                    break;
                }
                if (inputString.charAt(i + 1) == '>') {
                    break;
                }
                inputString.deleteCharAt(i + 1);
                strength -= 1;
            }

        }

        System.out.println(inputString);
    }
}

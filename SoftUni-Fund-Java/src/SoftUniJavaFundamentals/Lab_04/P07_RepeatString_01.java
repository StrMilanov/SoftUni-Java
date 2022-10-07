package SoftUniJavaFundamentals.Lab_04;

import java.util.Scanner;

public class P07_RepeatString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringInput = scanner.nextLine();
        int repeatAmount = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(stringInput, repeatAmount));
    }

    public static String repeatString(String string, int repeats) {
        String newString = "";
        for (int i = 1; i <= repeats; i++) {
            newString += string;
        }
        return newString;
    }

}

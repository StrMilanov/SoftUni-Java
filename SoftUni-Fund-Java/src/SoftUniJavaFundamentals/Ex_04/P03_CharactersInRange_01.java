package SoftUniJavaFundamentals.Ex_04;

import java.util.Scanner;

public class P03_CharactersInRange_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char char1 = scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);

        printCharsBetween(char1, char2);
    }

    public static void printCharsBetween(char ch1, char ch2) {
        if (ch1 < ch2) {
            for (int i = ch1 + 1; i < ch2; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = ch2 + 1; i < ch1; i++) {
                System.out.print((char) i + " ");
            }
        }

    }

}

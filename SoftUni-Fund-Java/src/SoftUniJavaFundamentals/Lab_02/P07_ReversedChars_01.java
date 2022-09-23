package SoftUniJavaFundamentals.Lab_02;

import java.util.Scanner;

public class P07_ReversedChars_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch1 = scanner.nextLine().charAt(0);
        char ch2 = scanner.nextLine().charAt(0);
        char ch3 = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c", ch3, ch2, ch1);

    }
}

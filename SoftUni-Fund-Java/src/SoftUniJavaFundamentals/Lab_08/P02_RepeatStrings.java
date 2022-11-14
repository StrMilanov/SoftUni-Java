package SoftUniJavaFundamentals.Lab_08;

import java.util.Scanner;

public class P02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder finalString = new StringBuilder();

        String[] inputArray = scanner.nextLine().split("\\s+");

        for (String element : inputArray) {
            for (int i = 0; i < element.length(); i++) {
                finalString.append(element);
            }
        }

        System.out.println(finalString);

    }
}

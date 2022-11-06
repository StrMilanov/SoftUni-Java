package SoftUniJavaFundamentals.Lab_07;

import java.util.Arrays;
import java.util.Scanner;

public class P04_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArray = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .filter(word -> word.length() % 2 == 0)
                .toArray(String[]::new);

        for (String word : wordsArray) {
            System.out.println(word);
        }

    }
}

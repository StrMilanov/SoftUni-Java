package SoftUniJavaFundamentals.Lab_02;

import java.util.Scanner;

public class P05_ConcatNames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.printf("%s%s%s", name1, delimiter, name2);

    }
}

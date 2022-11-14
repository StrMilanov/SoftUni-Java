package SoftUniJavaFundamentals.Ex_08;

import java.util.Scanner;

public class P04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder cypher = new StringBuilder();

        for (char c : input.toCharArray()) {
            c += 3;
            cypher.append(c);
        }

        System.out.println(cypher);
    }
}

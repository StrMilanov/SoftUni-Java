package SoftUniJavaFundamentals.Lab_02;

import java.util.Scanner;

public class P06_CharsToString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String output = "";

        for (int i = 1; i <= 3; i++){
            char input = scanner.nextLine().charAt(0);
            output += input;
        }

        System.out.println(output);

    }
}

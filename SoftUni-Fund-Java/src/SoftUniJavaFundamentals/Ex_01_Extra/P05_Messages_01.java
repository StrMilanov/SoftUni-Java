package SoftUniJavaFundamentals.Ex_01_Extra;

import java.util.Scanner;

public class P05_Messages_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = "";

        int iterations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= iterations; i++) {

            String input = scanner.nextLine();

            if (input.equals("0")) {
                message += " ";
            } else {
                int lengthNumber = input.length();
                int mainDigit = Integer.parseInt(input) % 10;
                int offset = 0;

                if (mainDigit == 8 || mainDigit == 9) {
                    offset = (mainDigit - 2) * 3 + 1;
                } else {
                    offset = (mainDigit - 2) * 3;
                }

                int letterIndex = offset + lengthNumber - 1;

                message += Character.toString(97 + letterIndex);
            }
        }

        System.out.print(message);

    }
}

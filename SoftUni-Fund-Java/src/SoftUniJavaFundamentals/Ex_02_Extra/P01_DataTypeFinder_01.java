package SoftUniJavaFundamentals.Ex_02_Extra;

import java.util.Scanner;

public class P01_DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            Scanner inputType = new Scanner(input);
            if (inputType.hasNextInt()) {
                System.out.printf("%s is integer type\n", input);
            } else if (inputType.hasNextFloat()) {
                System.out.printf("%s is floating point type\n", input);
            } else if (inputType.hasNextBoolean()) {
                System.out.printf("%s is boolean type\n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type\n", input);
            } else if (input.length() > 1) {
                System.out.printf("%s is string type\n", input);
            }

            input = scanner.nextLine();
        }

    }
}

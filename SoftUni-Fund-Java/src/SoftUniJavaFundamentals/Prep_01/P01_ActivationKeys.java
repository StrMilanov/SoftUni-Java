package SoftUniJavaFundamentals.Prep_01;

import java.util.Locale;
import java.util.Scanner;

public class P01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder key = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String[] command = input.split(">>>");
            switch (command[0]) {
                case "Contains":
                    if (key.toString().contains(command[1])) {
                        System.out.println(key + " contains " + command[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    int flipStartIndex = Integer.parseInt(command[2]);
                    int flipEndIndex = Integer.parseInt(command[3]);
                    if (command[1].equals("Upper")) {
                        key.replace(flipStartIndex, flipEndIndex, key.substring(flipStartIndex, flipEndIndex). toUpperCase(Locale.ROOT));
                    } else {
                        key.replace(flipStartIndex, flipEndIndex, key.substring(flipStartIndex, flipEndIndex). toLowerCase(Locale.ROOT));
                    }
                    System.out.println(key);
                    break;

                case "Slice":
                    int sliceStartIndex = Integer.parseInt(command[1]);
                    int sliceEndIndex = Integer.parseInt(command[2]);
                    key.replace(sliceStartIndex, sliceEndIndex, "");
                    System.out.println(key);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("Your activation key is: " + key);

    }
}

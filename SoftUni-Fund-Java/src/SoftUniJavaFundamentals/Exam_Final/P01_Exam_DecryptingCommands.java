package SoftUniJavaFundamentals.Exam_Final;

import java.util.Locale;
import java.util.Scanner;

public class P01_Exam_DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder string = new StringBuilder(scanner.nextLine());

        String splitRegex = "\\s+";
        String[] command = scanner.nextLine().split(splitRegex);
        while (!command[0].equals("Finish")) {

            switch (command[0]) {
                case "Replace":
                    String currentChar = command[1];
                    String newChar = command[2];
                    String tempStringReplace = string.toString().replaceAll(currentChar, newChar);
                    string.replace(0, string.length(), tempStringReplace);
                    System.out.println(string);
                    break;

                case "Cut":
                    int cutStartIndex = Integer.parseInt(command[1]);
                    int cutEndIndex = Integer.parseInt(command[2]);
                    if (cutStartIndex >= 0 && cutEndIndex >= 0 && cutStartIndex < string.length() && cutEndIndex < string.length()) {
                        String tempStringCut = string.replace(cutStartIndex, cutEndIndex + 1, "").toString();
                        string.replace(0, string.length(), tempStringCut);
                        System.out.println(string);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;

                case "Make":
                    if (command[1].equals("Upper")) {
                        String tempStringUpper = string.toString().toUpperCase(Locale.ROOT);
                        string.replace(0, string.length(), tempStringUpper);
                    } else if (command[1].equals("Lower")) {
                        String tempStringUpper = string.toString().toLowerCase(Locale.ROOT);
                        string.replace(0, string.length(), tempStringUpper);
                    }
                    System.out.println(string);
                    break;

                case "Check":
                    String stringToCheck = command[1];
                    if (string.toString().contains(stringToCheck)) {
                        System.out.printf("Message contains %s\n", stringToCheck);
                    } else {
                        System.out.printf("Message doesn't contain %s\n", stringToCheck);
                    }
                    break;

                case "Sum":
                    int sumStartIndex = Integer.parseInt(command[1]);
                    int sumEndIndex = Integer.parseInt(command[2]);
                    int sumChars = 0;
                    if (sumStartIndex >= 0 && sumEndIndex >= 0 && sumStartIndex < string.length() && sumEndIndex < string.length()) {
                        String substring = string.substring(sumStartIndex, sumEndIndex + 1);
                        for (char c : substring.toCharArray()) {
                            sumChars += c;
                        }
                        System.out.println(sumChars);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }

            command = scanner.nextLine().split(splitRegex);
        }

    }
}

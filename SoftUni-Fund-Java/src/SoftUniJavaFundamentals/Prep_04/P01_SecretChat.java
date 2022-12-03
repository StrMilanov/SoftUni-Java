package SoftUniJavaFundamentals.Prep_04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P01_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder hiddenMessage = new StringBuilder(scanner.nextLine());

        String splitRegex = ":\\|:";
        String[] command = scanner.nextLine().split(splitRegex);
        while (!command[0].equals("Reveal")) {
            switch (command[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(command[1]);
                    hiddenMessage.insert(index, " ");

                    System.out.println(hiddenMessage);
                    break;

                case "Reverse":
                    String substringToReverse = command[1];

                    if (hiddenMessage.toString().contains(substringToReverse)) {
                        String tempMessageReverse = hiddenMessage.toString().replaceFirst(substringToReverse, reverseString(substringToReverse));
                        hiddenMessage.replace(0, hiddenMessage.length(), tempMessageReverse);
                    } else {
                        System.out.println("error");
                    }

                    System.out.println(hiddenMessage);
                    break;

                case "ChangeAll":
                    String substringToReplace = command[1];
                    String replacement = command[2];

                    String tempMessageChange = hiddenMessage.toString().replaceAll(substringToReplace, replacement);
                    hiddenMessage.replace(0, hiddenMessage.length(), tempMessageChange);

                    System.out.println(hiddenMessage);
                    break;
            }

            command = scanner.nextLine().split(splitRegex);
        }

        // OUTPUT
        System.out.printf("You have a new text message: %s\n", hiddenMessage);

    }


    private static String reverseString(String string) {
//        StringBuilder reversedSubstring = new StringBuilder(string);
//        return reversedSubstring.reverse().toString();

        StringBuilder reversedSubstring = new StringBuilder();
        String[] charactersArr = string.split("");
        for (int i = charactersArr.length - 1; i >= 0; i--) {
            if (charactersArr[i].equals("?")) {
                reversedSubstring.append("\\?");
            } else {
                reversedSubstring.append(charactersArr[i]);
            }
        }

        return reversedSubstring.toString();
    }

}

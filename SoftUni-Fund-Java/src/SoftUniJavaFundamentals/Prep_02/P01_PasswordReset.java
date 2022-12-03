package SoftUniJavaFundamentals.Prep_02;

import java.util.Scanner;

public class P01_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder passwordSB = new StringBuilder(scanner.nextLine());

        String splitRegex = " ";
        String[] command = scanner.nextLine().split(splitRegex);
        while (!command[0].equals("Done")) {
            switch (command[0]) {
                case "TakeOdd":
                    StringBuilder passwordOdds = new StringBuilder();
                    for (int i = 1; i < passwordSB.length(); i += 2) {
                        passwordOdds.append(passwordSB.toString().charAt(i));
                    }
                    passwordSB.replace(0, passwordSB.length(), passwordOdds.toString());
                    System.out.println(passwordSB);
                    break;

                case "Cut":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = startIndex + Integer.parseInt(command[2]);
                    if (endIndex != startIndex) {
                        String toRemove = passwordSB.substring(startIndex, endIndex);
                        String cutPass = passwordSB.toString().replaceFirst(toRemove, "");
                        passwordSB.replace(0, passwordSB.length(), cutPass);
                        System.out.println(passwordSB);
                    } else {
                        System.out.println(passwordSB);
                    }
                    break;

                case "Substitute":
                    String substring = command[1];
                    String toReplace = command[2];
                    if (passwordSB.toString().contains(substring)) {
                        String subPass = passwordSB.toString().replaceAll(substring, toReplace);
                        passwordSB.replace(0, passwordSB.length(), subPass);
                        System.out.println(passwordSB);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            command = scanner.nextLine().split(splitRegex);
        }

        System.out.println("Your password is: " + passwordSB);

    }
}

package SoftUniJavaFund.Ex_01;

import java.util.Scanner;

public class P05_Login_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";
        int countFail = 1;

        for (int i = username.length() - 1; i >= 0; i--) {
            char letter = username.charAt(i);
            password += letter;
        }

        String passwordInput = scanner.nextLine();
        while (!passwordInput.equals(password)) {
            System.out.println("Incorrect password. Try again.");
            countFail++;

            if (countFail == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }

            passwordInput = scanner.nextLine();
        }

        if (passwordInput.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }

}


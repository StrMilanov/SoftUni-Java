package FirstStepsInCoding.Lab_05;

import java.util.Scanner;

public class P02_Password_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = scanner.nextLine();

        String passwordInput = scanner.nextLine();
        while (!passwordInput.equals(password)) {
            passwordInput = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", name);

    }
}

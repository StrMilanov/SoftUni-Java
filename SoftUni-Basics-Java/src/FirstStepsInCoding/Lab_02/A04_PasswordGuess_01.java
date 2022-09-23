package FirstStepsInCoding.Lab_02;

import java.util.Scanner;

public class A04_PasswordGuess_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (password.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");
        }
    }
}

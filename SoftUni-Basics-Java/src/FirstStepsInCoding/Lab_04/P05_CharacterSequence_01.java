package FirstStepsInCoding.Lab_04;

import java.util.Scanner;

public class P05_CharacterSequence_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        for (int i = 0; i < inputString.length(); i++){
            System.out.printf("%s%n", inputString.charAt(i));
        }
    }
}

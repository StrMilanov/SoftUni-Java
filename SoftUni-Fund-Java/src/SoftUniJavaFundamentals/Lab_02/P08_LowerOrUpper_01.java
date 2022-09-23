package SoftUniJavaFundamentals.Lab_02;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class P08_LowerOrUpper_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char inputChar = scanner.nextLine().charAt(0);

        if (isUpperCase(inputChar)) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }

//        // Alternative
//
//        if (inputChar >= 'A' && inputChar <= 'Z') {
//            System.out.println("upper-case");
//        } else {
//            System.out.println("lower-case");
//        }

    }
}

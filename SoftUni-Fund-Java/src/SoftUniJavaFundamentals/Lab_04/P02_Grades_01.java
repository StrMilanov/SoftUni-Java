package SoftUniJavaFundamentals.Lab_04;

import java.util.Scanner;

public class P02_Grades_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gradeInput = Double.parseDouble(scanner.nextLine());

        printGradeInWords(gradeInput);
    }

    public static void printGradeInWords(double n) {
        if (n >= 2 && n < 3) {
            System.out.println("Fail");
        } else if (n < 3.5) {
            System.out.println("Poor");
        } else if (n < 4.5) {
            System.out.println("Good");
        } else if (n < 5.5) {
            System.out.println("Very good");
        } else if (n <= 6) {
            System.out.println("Excellent");
        }
    }

}

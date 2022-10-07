package SoftUniJavaFundamentals.Lab_04;

import java.util.Scanner;

public class P11_MathOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNum = Double.parseDouble(scanner.nextLine());

        switch (operator) {
            case "/":
                System.out.printf("%.0f", divideNumbers(firstNum, secondNum));
                break;
            case "*":
                System.out.printf("%.0f", multiplyNumbers(firstNum, secondNum));
                break;
            case "+":
                System.out.printf("%.0f", sumNumbers(firstNum, secondNum));
                break;
            case "-":
                System.out.printf("%.0f", subtractNumbers(firstNum, secondNum));
                break;
        }
    }

    public static double divideNumbers(double a, double b) {
        return a / b;
    }

    public static double multiplyNumbers(double a, double b) {
        return a * b;
    }

    public static double sumNumbers(double a, double b) {
        return a + b;
    }

    public static double subtractNumbers(double a, double b) {
        return a - b;
    }

}
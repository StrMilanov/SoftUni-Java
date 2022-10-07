package SoftUniJavaFundamentals.Lab_04;

import java.util.Scanner;

public class P04_Calculations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                System.out.println(addNumbers(num1, num2));
                break;

            case "multiply":
                System.out.println(multiplyNumbers(num1, num2));
                break;

            case "subtract":
                System.out.println(subtractNumbers(num1, num2));
                break;

            case "divide":
                System.out.println(divideNumbers(num1, num2));
                break;
        }
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static int subtractNumbers(int a, int b) {
        return a - b;
    }

    public static int divideNumbers(int a, int b) {
        return a / b;
    }

}

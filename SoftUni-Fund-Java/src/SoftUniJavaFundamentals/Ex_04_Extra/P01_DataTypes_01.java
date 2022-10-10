package SoftUniJavaFundamentals.Ex_04_Extra;

import java.util.Scanner;

public class P01_DataTypes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputType = scanner.nextLine();

        switch (inputType) {
            case "int":
                int num = Integer.parseInt(scanner.nextLine());
                printOperationResult(num);
                break;
            case "real":
                double real = Double.parseDouble(scanner.nextLine());
                printOperationResult(real);
                break;
            case "string":
                String text = scanner.nextLine();
                printOperationResult(text);
                break;
        }

    }

    public static void printOperationResult(int n) {
        System.out.println(n * 2);
    }

    public static void printOperationResult(double n) {
        System.out.printf("%.2f", n * 1.5);
    }

    public static void printOperationResult(String text){
        System.out.println("$" + text + "$");
    }

}

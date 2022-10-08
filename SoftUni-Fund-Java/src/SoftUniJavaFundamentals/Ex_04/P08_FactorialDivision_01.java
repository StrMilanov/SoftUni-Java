package SoftUniJavaFundamentals.Ex_04;

import java.util.Scanner;

public class P08_FactorialDivision_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", getFactorial(num1) / getFactorial(num2));
    }

    public static double getFactorial(int n){
        double total = 1;
        for (int i = 1; i <= n ; i++) {
            total *= i;
        }
        return total;
    }

}

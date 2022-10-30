package SoftUniJavaFundamentals.Lab_06;

import java.math.BigInteger;
import java.util.Scanner;

public class P02_SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger num1 = new BigInteger(scanner.nextLine());
        BigInteger num2 = new BigInteger(scanner.nextLine());

        System.out.println(num1.add(num2));

    }
}

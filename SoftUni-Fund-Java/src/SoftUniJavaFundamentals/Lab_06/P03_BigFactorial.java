package SoftUniJavaFundamentals.Lab_06;

import java.math.BigInteger;
import java.util.Scanner;

public class P03_BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger factN = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= n; i++) {
            factN = factN.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factN);
    }
}

package SoftUniJavaAdvanced.Ex_01;

import java.util.Scanner;

public class P06_RecursiveFibonacci {
    public static long[] memoryForFib;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        memoryForFib = new long[n + 1];
        System.out.println(getFibonacci(n));

    }


    private static long getFibonacci(int n) {

        if (n <= 1) {
            return 1;
        }

        if (memoryForFib[n] != 0) {
            return memoryForFib[n];
        }

        return memoryForFib[n] = getFibonacci(n - 1) + getFibonacci(n - 2);
    }

}

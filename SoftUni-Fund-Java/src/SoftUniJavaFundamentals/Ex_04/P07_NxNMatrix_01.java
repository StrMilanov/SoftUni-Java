package SoftUniJavaFundamentals.Ex_04;

import java.util.Scanner;

public class P07_NxNMatrix_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printMatrixNxN(num);
    }

    public static void printMatrixNxN(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

}

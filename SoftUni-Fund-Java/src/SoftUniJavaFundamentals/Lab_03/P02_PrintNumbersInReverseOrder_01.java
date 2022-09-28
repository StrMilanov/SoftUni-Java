package SoftUniJavaFundamentals.Lab_03;

import java.util.Scanner;

public class P02_PrintNumbersInReverseOrder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAmount = Integer.parseInt(scanner.nextLine());

        int[] numArr = new int[numAmount];
        for (int i = 0; i <= numAmount - 1; i++) {
            numArr[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = numArr.length - 1; i >= 0; i--) {
            System.out.print(numArr[i] + " ");
        }

    }
}

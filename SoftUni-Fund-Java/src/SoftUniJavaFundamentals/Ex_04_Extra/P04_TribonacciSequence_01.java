package SoftUniJavaFundamentals.Ex_04_Extra;

import java.util.Scanner;

public class P04_TribonacciSequence_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        System.out.print(1 + " ");
        printTribonacciSequence(num);

    }

    private static void printTribonacciSequence(int num) {
        int[] numArray = {0, 0, 1};
        for (int i = 1; i < num; i++) {
            int sum = numArray[0] + numArray[1] + numArray[2];
            System.out.print(sum + " ");

            updateArray(numArray, sum);
        }
    }

    private static void updateArray(int[] numArray, int lastNum) {
        for (int j = 0; j < 2; j++) {
            numArray[j] = numArray[j + 1];
        }
        numArray[2] = lastNum;
    }

}

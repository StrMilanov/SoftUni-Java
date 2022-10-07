package SoftUniJavaFundamentals.Lab_04;

import java.util.Scanner;

public class P03_PrintingTriangle_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        printTriangle(1, inputNum);
    }

    public static void printTriangle(int start, int end) {
        for (int i = start; i <= end; i++) {
            printLine(i);
            System.out.println();
        }
        for (int i = end - 1; i > 0; i--) {
            printLine(i);
            System.out.println();
        }
    }

    public static void printLine(int lineLength) {
        for (int i = 1; i <= lineLength; i++) {
            System.out.print(i + " ");
        }
    }

}

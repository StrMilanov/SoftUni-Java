package SoftUniJavaFundamentals.Ex_03;

import java.util.Scanner;

public class P02_CommonElements_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");

        for (String elementArr2 : array2) {

            for (String elementArr1 : array1) {

                if (elementArr2.equals(elementArr1)) {
                    System.out.print(elementArr2 + " ");
                }

            }

        }

    }
}

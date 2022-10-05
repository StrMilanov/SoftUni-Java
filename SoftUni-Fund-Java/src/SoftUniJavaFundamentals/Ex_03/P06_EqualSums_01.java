package SoftUniJavaFundamentals.Ex_03;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualSums_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isExists = true;

        for (int i = 0; i < array.length; i++) {
            isExists = true;
            int sumToLeft = 0;
            int sumToRight = 0;

            for (int j = 0; j < i; j++) {
                sumToLeft += array[j];
            }

            for (int k = i + 1; k < array.length; k++) {
                sumToRight += array[k];
            }

            if (sumToLeft == sumToRight) {
                System.out.println(i);
                break;
            } else {
                isExists = false;
            }
        }

        if (!isExists){
            System.out.println("no");
        }

    }
}

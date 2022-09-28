package SoftUniJavaFundamentals.Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class P05_EvenAndOddSubtraction_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i <= numArr.length - 1; i++) {
            if (numArr[i] % 2 == 0) {
                sumEven += numArr[i];
            } else {
                sumOdd += numArr[i];
            }
        }

        System.out.println(sumEven - sumOdd);
    }
}

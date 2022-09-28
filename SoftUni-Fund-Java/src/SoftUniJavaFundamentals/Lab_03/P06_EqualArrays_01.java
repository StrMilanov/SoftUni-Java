package SoftUniJavaFundamentals.Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualArrays_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isIdentical = true;
        int index = 0;
        int sum = 0;
        for (int i = 0; i <= firstArr.length - 1; i++) {
            if (firstArr[i] != (secondArr[i])) {
                isIdentical = false;
                index = i;
                break;
            } else {
                sum += firstArr[i];
            }
        }

        if (isIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }

    }
}

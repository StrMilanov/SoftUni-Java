package SoftUniJavaFundamentals.Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class P07_CondenseArrayToNumber_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (numsArr.length > 1) {
        int[] condArr = new int[numsArr.length - 1];

            for (int i = 0; i <= numsArr.length - 1; i++) {
                if (i == numsArr.length - 1) {
                    break;
                }

                int sum = numsArr[i] + numsArr[i + 1];
                condArr[i] = sum;
            }

            numsArr = condArr;
        }


        System.out.println(numsArr[0]);
    }
}

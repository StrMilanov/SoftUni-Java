package SoftUniJavaFundamentals.Ex_03;

import java.util.Arrays;
import java.util.Scanner;

public class P05_TopIntegers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < array.length; i++) {
            boolean isTopInt = true;
            int currentElement = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (currentElement <= array[j]) {
                    isTopInt = false;
                    break;
                }
            }

            if (isTopInt) {
                System.out.print(currentElement + " ");
            }

        }

    }
}

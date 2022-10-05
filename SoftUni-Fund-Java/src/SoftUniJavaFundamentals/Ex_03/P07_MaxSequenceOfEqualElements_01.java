package SoftUniJavaFundamentals.Ex_03;

import java.util.Scanner;

public class P07_MaxSequenceOfEqualElements_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        String maxElement = "";
        int countMaxSequence = 0;

        for (int current = 0; current <= array.length - 1; current++) {
            int countCurrentSequence = 0;

            for (int next = current + 1; next <= array.length - 1; next++) {
                if (array[current].equals(array[next])) {
                    countCurrentSequence++;
                } else {
                    break;
                }
            }

            if (countCurrentSequence > countMaxSequence) {
                countMaxSequence = countCurrentSequence;
                maxElement = array[current];
            }
        }

        for (int i = 0; i <= countMaxSequence; i++) {
            System.out.print(maxElement + " ");
        }

    }
}

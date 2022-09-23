package FirstStepsInCoding.Exercises_06;

import java.util.Scanner;

public class P02_EqualSumsEvenOddPosition_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        int numLength = input1.length();
        int n1 = Integer.parseInt(input1);
        int n2 = Integer.parseInt(input2);
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = n1; i <= n2; i++) {
            int tempNum = i;

            while (numLength > 0) {

                int nextDigit = tempNum % 10;

                if (numLength % 2 == 0) {
                    sumEven += nextDigit;
                } else {
                    sumOdd += nextDigit;
                }


                tempNum /= 10;
                numLength--;

            }

                if (sumEven == sumOdd) {
                    System.out.printf("%d ", i);
                }
            sumEven = 0;
            sumOdd = 0;

            numLength = input1.length();
        }

    }
}

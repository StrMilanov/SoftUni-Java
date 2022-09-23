package FirstStepsInCoding.Lab_04;

import java.util.Scanner;

public class P08_NumberSequence_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAmount = Integer.parseInt(scanner.nextLine());
        int numMin = Integer.MAX_VALUE;
        int numMax = Integer.MIN_VALUE;

        for (int i = 1; i <= numAmount; i++) {
            int numNext = Integer.parseInt(scanner.nextLine());

            if (numNext < numMin) {
                numMin = numNext;
            }
            if (numNext > numMax) {
                numMax = numNext;
            }

        }

        System.out.printf("Max number: %d\nMin number: %d", numMax, numMin);

    }
}

package FirstStepsInCoding.Lab_06;

import java.util.Scanner;

public class P04_SumOfTwoNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int nMagic = Integer.parseInt(scanner.nextLine());

        int numMagic1 = 0;
        int numMagic2 = 0;
        int counter = 0;
        boolean isNumFound = false;

        for (int i = n1; i <= n2; i++) {
            for (int j = n1; j <= n2; j++) {
                counter++;
                if (i + j == nMagic) {
                    numMagic1 = i;
                    numMagic2 = j;
                    isNumFound = true;
                    break;
                }
            }
            if (isNumFound) {
                break;
            }
        }

        if (isNumFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, numMagic1, numMagic2, nMagic);
        } else {
            System.out.printf("%d combinations - neither equals %d", counter, nMagic);
        }

    }
}

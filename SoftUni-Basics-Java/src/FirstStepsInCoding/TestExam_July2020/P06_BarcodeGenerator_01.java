package FirstStepsInCoding.TestExam_July2020;

import java.util.Scanner;

public class P06_BarcodeGenerator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        int n1ch4 = n1 % 10;
        int n1ch3 = n1 % 100 / 10;
        int n1ch2 = n1 % 1000 / 100;
        int n1ch1 = n1 % 10000 / 1000;

        int n2ch4 = n2 % 10;
        int n2ch3 = n2 % 100 / 10;
        int n2ch2 = n2 % 1000 / 100;
        int n2ch1 = n2 % 10000 / 1000;

        for (int i = n1ch1; i <= n2ch1; i++) {
            if (i % 2 == 0) {
                continue;
            }

            for (int j = n1ch2; j <= n2ch2; j++) {
                if (j % 2 == 0) {
                    continue;
                }

                for (int k = n1ch3; k <= n2ch3; k++) {
                    if (k % 2 == 0) {
                        continue;
                    }

                    for (int l = n1ch4; l <= n2ch4; l++) {
                        if (l % 2 == 0) {
                            continue;
                        }

                        System.out.printf("%d%d%d%d ", i, j, k, l);

                    }

                }

            }

        }

    }

}

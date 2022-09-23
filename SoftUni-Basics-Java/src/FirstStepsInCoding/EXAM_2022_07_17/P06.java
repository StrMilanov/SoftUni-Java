package FirstStepsInCoding.EXAM_2022_07_17;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int n1 = n % 10;
        int n2 = (n / 10) % 10;
        int n3 = (n / 100) % 10;

        for (int i = 1; i <= n1; i++) {

            for (int j = 1; j <= n2; j++) {

                for (int k = 1; k <= n3; k++) {

                    sum = i * j * k;
                    System.out.printf("%d * %d * %d = %d;\n", i, j, k, sum);

                }
            }
        }

    }
}

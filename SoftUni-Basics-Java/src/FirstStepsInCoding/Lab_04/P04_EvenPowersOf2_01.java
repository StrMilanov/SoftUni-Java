package FirstStepsInCoding.Lab_04;

import java.util.Scanner;

public class P04_EvenPowersOf2_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i += 2) {
            System.out.printf("%.0f\n", Math.pow(2, i));
        }

    }
}

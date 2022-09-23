package FirstStepsInCoding.Exercises_04;

import java.util.Scanner;

public class P03_Histogram_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        int d4 = 0;
        int d5 = 0;

        for (int i = 1; i <= n; i++) {
            int numNext = Integer.parseInt(scanner.nextLine());
            if (numNext < 200) {
                d1++;
            } else if (numNext <= 399) {
                d2++;
            } else if (numNext <= 599) {
                d3++;
            } else if (numNext <= 799) {
                d4++;
            } else {
                d5++;
            }
        }

        p1 = 1.0 * d1 / n * 100;
        p2 = 1.0 * d2 / n * 100;
        p3 = 1.0 * d3 / n * 100;
        p4 = 1.0 * d4 / n * 100;
        p5 = 1.0 * d5 / n * 100;

        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%", p1, p2, p3, p4, p5);

    }
}

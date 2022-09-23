package FirstStepsInCoding.Exercises_06;

import java.util.Scanner;

public class P01_NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        boolean end = false;

        for (int row = 0; row <= n; row++) {
            for (int position = 0; position <= row; position++) {
                if (num > n) {
                    end = true;
                    break;
                } else {
                    System.out.printf("%d ", num);
                    num++;
                }
            }

            if (end) {
                break;
            }

            System.out.println();
        }

    }
}

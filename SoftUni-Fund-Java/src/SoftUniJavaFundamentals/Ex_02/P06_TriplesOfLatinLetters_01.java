package SoftUniJavaFundamentals.Ex_02;

import java.util.Scanner;

public class P06_TriplesOfLatinLetters_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int ch1 = 96 + i;

            for (int j = 1; j <= n; j++) {
                int ch2 = 96 + j;

                for (int k = 1; k <= n; k++) {
                    int ch3 = 96 + k;
                    System.out.printf("%c%c%c\n", ch1, ch2, ch3);
                }
            }
        }

//        // Alternative solution:
//        for (int i = 1; i <= n; i++) {
//            String ch1 = Character.toString(96 + i);
//
//            for (int j = 1; j <= n; j++) {
//                String ch2 = Character.toString(96 + j);
//
//                for (int k = 1; k <= n; k++) {
//                    String ch3 = Character.toString(96 + k);
//                    System.out.print(ch1 + ch2 + ch3);
//                    System.out.println();
//                }
//            }
//        }

    }
}

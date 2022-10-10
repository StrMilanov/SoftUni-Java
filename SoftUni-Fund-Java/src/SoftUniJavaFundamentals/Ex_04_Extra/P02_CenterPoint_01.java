package SoftUniJavaFundamentals.Ex_04_Extra;

import java.util.Scanner;

public class P02_CenterPoint_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X1 = Integer.parseInt(scanner.nextLine());
        int Y1 = Integer.parseInt(scanner.nextLine());
        int X2 = Integer.parseInt(scanner.nextLine());
        int Y2 = Integer.parseInt(scanner.nextLine());

        double distance1 = getDiagonal(X1, Y1);
        double distance2 = getDiagonal(X2, Y2);

        if (distance1 < distance2) {
            System.out.printf("(%d, %d)", X1, Y1);
        } else if (distance2 < distance1) {
            System.out.printf("(%d, %d)", X2, Y2);
        } else {
            System.out.printf("(%d, %d)", X1, Y1);
        }
    }

    public static double getDiagonal(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

}

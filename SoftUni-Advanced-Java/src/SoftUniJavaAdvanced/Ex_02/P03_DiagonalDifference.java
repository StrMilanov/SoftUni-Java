package SoftUniJavaAdvanced.Ex_02;

import java.util.Scanner;

public class P03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] intMatrix = new int[n][n];

        fillMatrix(intMatrix, scanner);
        int sumDiagonalMain = sumDiagonalMain(intMatrix);
        int sumDiagonalAnti = sumDiagonalAnti(intMatrix);

        System.out.println(Math.abs(sumDiagonalMain - sumDiagonalAnti));
    }


    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix[0].length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                int num = scanner.nextInt();
                matrix[row][col] = num;
            }
        }
    }


    private static int sumDiagonalMain(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }


    private static int sumDiagonalAnti(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum += matrix[matrix.length - 1 - i][i];
        }
        return sum;
    }


}

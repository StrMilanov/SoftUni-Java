package SoftUniJavaAdvanced.Ex_02;

import java.util.Scanner;

public class P04_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] matrix = new int[r][c];
        int[] maxSumStartIndexes = new int[2];
        int maxSum3x3 = Integer.MIN_VALUE;

        // FILL MATRIX
        fillMatrix(matrix, r, c, scanner);

        // FIND MAX SUM OF 3 X 3
        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[0].length - 2; col++) {

                int sum3x3 = 0;
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        sum3x3 += matrix[i][j];
                    }
                }

                if (sum3x3 > maxSum3x3) {
                    maxSum3x3 = sum3x3;
                    maxSumStartIndexes[0] = row;
                    maxSumStartIndexes[1] = col;
                }
            }
        }

        // OUTPUT
        System.out.println("Sum = " + maxSum3x3);
        printMatrixMaxSum(matrix, maxSumStartIndexes, 3);
    }


    private static void printMatrixMaxSum(int[][] matrix, int[] start, int size) {
        int r = start[0];
        int c = start[1];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[r + row][c + col] + " ");
            }
            System.out.println();
        }
    }


    private static void fillMatrix(int[][] matrix, int rows, int cols, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }


}

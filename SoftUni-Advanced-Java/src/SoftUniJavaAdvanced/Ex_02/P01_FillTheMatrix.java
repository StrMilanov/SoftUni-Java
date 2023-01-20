package SoftUniJavaAdvanced.Ex_02;

import java.util.Scanner;

public class P01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String splitRegex = ",\\s+";
        String input = scanner.nextLine();
        int size = Integer.parseInt(input.split(splitRegex)[0]);
        String type = input.split(splitRegex)[1];

        int[][] matrix = new int[size][size];

        if (type.equals("A")) {
            fillMatrixA(matrix);
        } else if (type.equals("B")) {
            fillMatrixB(matrix);
        }

        printMatrix(matrix);
    }




    private static int[][] fillMatrixA(int[][] matrix) {
        int num = 0;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                num++;
                matrix[row][col] = num;
            }
        }

        return matrix;
    }


    private static int[][] fillMatrixB(int[][] matrix) {
        int num = 0;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    num++;
                    matrix[row][col] = num;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    num++;
                    matrix[row][col] = num;
                }
            }
        }

        return matrix;
    }


    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


}

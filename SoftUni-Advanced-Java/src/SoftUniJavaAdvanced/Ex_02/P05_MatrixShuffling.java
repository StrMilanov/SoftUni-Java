package SoftUniJavaAdvanced.Ex_02;

import java.util.Arrays;
import java.util.Scanner;

public class P05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isInvalidInput = false;
        int[] size = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];
        String[][] matrix = new String[rows][cols];

        fillMatrix(matrix, rows, cols, scanner);

        String[] input = scanner.nextLine().split("\\s+");
        while (!input[0].equals("END")) {
            if (input[0].equals("swap") && input.length == 5) {
                int row1 = Integer.parseInt(input[1]);
                int col1 = Integer.parseInt(input[2]);
                int row2 = Integer.parseInt(input[3]);
                int col2 = Integer.parseInt(input[4]);

                // Coordinate validation & Swap
                if (row1 < rows && row2 < rows && col1 < cols && col2 < cols) {
                    String value1 = matrix[row1][col1];
                    String value2 = matrix[row2][col2];

                    matrix[row1][col1] = value2;
                    matrix[row2][col2] = value1;

                    printMatrix(matrix);

                } else {
                    isInvalidInput = true;
                }

            } else {
                isInvalidInput = true;
            }

            if (isInvalidInput) {
                System.out.println("Invalid input!");
                isInvalidInput = false;
            }

            input = scanner.nextLine().split("\\s+");
        }

    }


    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


    private static void fillMatrix(String[][] matrix, int r, int c, Scanner scanner) {
        for (int row = 0; row < r; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }


}

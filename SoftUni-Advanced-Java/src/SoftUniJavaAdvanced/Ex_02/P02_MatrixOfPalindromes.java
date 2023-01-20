package SoftUniJavaAdvanced.Ex_02;

import java.util.Arrays;
import java.util.Scanner;

public class P02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];

        String[][] palMatrix = new String[rows][cols];

        fillMatrix(palMatrix, rows, cols);
        printMatrix(palMatrix, rows, cols);
    }


    private static String[][] fillMatrix(String[][] matrix, int rows, int cols) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                char l1 = (char) (r + 97);
                char l2 = (char) (c + r + 97);
                String element = "" + l1 + l2 + l1;
                matrix[r][c] = element;
            }
        }
        return matrix;
    }


    private static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


}

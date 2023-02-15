package SoftUniJavaAdvanced.Ex_02;

import java.util.Scanner;

public class P11_ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split("\\s+");
        int r = Integer.parseInt(dimensions[0]);
        int c = Integer.parseInt(dimensions[1]);
        String[][] matrix = new String[r][c];
        fillMatrix(matrix, scanner);

        int row = r - 1;
        int col = c - 1;

        while (row != -1) {

            int currentRow = row;
            int currentCol = col;

            while (currentCol < c && currentRow >= 0) {
                System.out.print(matrix[currentRow][currentCol] + " ");
                currentRow--;
                currentCol++;
            }
            System.out.println();

            col--;

            if (col < 0) {
                row -= 1;
                col = 0;
            }


        }

    }


    public static void fillMatrix(String[][] matrix, Scanner sc) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = sc.nextLine().split("\\s+");
        }
    }

}

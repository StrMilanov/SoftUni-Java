package SoftUniJavaAdvanced.Ex_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TOFIX_P07_Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String splitRegex = "\\s+";
        String[] input = scanner.nextLine().split(splitRegex);

        // Initialize Matrix
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        List<List<Integer>> matrix = new ArrayList<>();
        fillMatrix(matrix, rows, cols);

        //...
        String command = scanner.nextLine();
        while (!command.equals("Nuke it from orbit")) {
            int x = Integer.parseInt(command.split(splitRegex)[0]);
            int y = Integer.parseInt(command.split(splitRegex)[1]);
            int r = Integer.parseInt(command.split(splitRegex)[2]);

            // Validate Horizontal
            int horStartIndex = r - y;
            int horToDestroy = r * 2 + 1;
            if (horStartIndex < 0) {
                horStartIndex = 0;
            }
            // Destroy Horizontal
            for (int currentCol = horStartIndex; currentCol <= horToDestroy; currentCol++) {
                if (matrix.get(x).size() > (matrix.get(x).size() - 1) - horToDestroy) {
                    matrix.get(x).remove(horStartIndex);
                }
            }

            // Validate Vertical
            int vertStartIndex = r - x;
            int vertToDestroy = r * 2 + 1;
            if (vertStartIndex < 0) {
                vertStartIndex = 0;
            }
            // Destroy Vertical
            for (int currentRow = vertStartIndex; currentRow <= vertToDestroy; currentRow++) {
                matrix.get(y).remove(vertStartIndex);
            }

            command = scanner.nextLine();
        }

        matrix.removeIf(List::isEmpty);

        printMatrix(matrix);
    }

    private static boolean isInMatrix(List<List<Integer>> matrix, int row, int col) {
        return row >= 0 && row < matrix.size() && col >= 0 && row < matrix.get(row).size();
    }


    // FILL MATRIX
    private static void fillMatrix(List<List<Integer>> matrix, int rows, int cols) {
        int num = 1;
        for (int r = 0; r < rows; r++) {
            matrix.add(new ArrayList<>());
            for (int c = 0; c < cols; c++, num++) {
                matrix.get(r).add(num);
            }
        }
    }


    // PRINT MATRIX
    private static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }


}

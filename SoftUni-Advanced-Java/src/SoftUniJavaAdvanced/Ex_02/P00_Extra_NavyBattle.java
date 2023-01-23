package SoftUniJavaAdvanced.Ex_02;

import java.util.Scanner;

public class P00_Extra_NavyBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[n][n];

        int submarineHP = 3;
        int countCruisers = 0;

        // Fill matrix
        fillMatrix(matrix, scanner);

        // Find submarine START coordinates
        int submarineRow = -1;
        int submarineCol = -1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col].equals("S")) {
                    submarineRow = row;
                    submarineCol = col;
                }
            }
        }

        String command = scanner.nextLine();
        while (submarineHP > 0 && countCruisers < 3) {
            matrix[submarineRow][submarineCol] = "-";

            switch (command) {
                case "up":
                    submarineRow--;
                    break;
                case "down":
                    submarineRow++;
                    break;
                case "left":
                    submarineCol--;
                    break;
                case "right":
                    submarineCol++;
                    break;
            }

            String submarineCoordinates = matrix[submarineRow][submarineCol];

            switch (submarineCoordinates) {
                case "-":
                    matrix[submarineRow][submarineCol] = "S";
                    break;

                case "*":
                    submarineHP--;
                    matrix[submarineRow][submarineCol] = "S";
                    break;

                case "C":
                    countCruisers++;
                    matrix[submarineRow][submarineCol] = "S";
                    if (countCruisers == 3) {
                        break;
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        if (submarineHP == 0) {
            System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n", submarineRow, submarineCol);
        } else if (countCruisers == 3) {
            System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
        }

        // PRINT MATRIX
        printMatrix(matrix);

    }


    // FILL MATRIX
    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = scanner.nextLine().split("");
        }
    }


    // PRINT MATRIX
    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + "");
            }
            System.out.println();
        }
    }


}

package SoftUniJavaAdvanced.Ex_02;

import java.util.Scanner;

public class P00_Extra_StickyFingers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[] directions = scanner.nextLine().split(",");

        String[][] fieldMatrix = new String[size][size];
        fillMatrix(fieldMatrix, scanner);

        int totalMoneyStolen = 0;
        boolean isArrested = false;

        // Find Thief start coordinates
        int rowThief = -1;
        int colThief = -1;
        for (int row = 0; row < fieldMatrix.length; row++) {
            for (int col = 0; col < fieldMatrix[0].length; col++) {
                if (fieldMatrix[row][col].equals("D")) {
                    rowThief = row;
                    colThief = col;
                    break;
                }
            }
        }


        //...
        for (String direction : directions) {
            switch (direction) {
                case "left":
                    if (colThief - 1 < 0) {
                        System.out.println("You cannot leave the town, there is police outside!");
                    } else {
                        fieldMatrix[rowThief][colThief] = "+";
                        colThief--;
                    }
                    break;

                case "right":
                    if (colThief + 1 >= fieldMatrix.length) {
                        System.out.println("You cannot leave the town, there is police outside!");
                    } else {
                        fieldMatrix[rowThief][colThief] = "+";
                        colThief++;
                    }
                    break;

                case "up":
                    if (rowThief - 1 < 0) {
                        System.out.println("You cannot leave the town, there is police outside!");
                    } else {
                        fieldMatrix[rowThief][colThief] = "+";
                        rowThief--;
                    }
                    break;

                case "down":
                    if (rowThief + 1 >= fieldMatrix.length) {
                        System.out.println("You cannot leave the town, there is police outside!");
                    } else {
                        fieldMatrix[rowThief][colThief] = "+";
                        rowThief++;
                    }
                    break;
            }


            String currentPosition = fieldMatrix[rowThief][colThief];
            switch (currentPosition) {
                case "$":
                    int stolenMoney = rowThief * colThief;
                    fieldMatrix[rowThief][colThief] = "D";
                    System.out.printf("You successfully stole %d$.%n", stolenMoney);
                    totalMoneyStolen += stolenMoney;
                    break;

                case "P":
                    System.out.printf("You got caught with %d$, and you are going to jail.%n", totalMoneyStolen);
                    fieldMatrix[rowThief][colThief] = "#";
                    isArrested = true;
                    printMatrix(fieldMatrix);
                    return;
            }
        }

        // END
        System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", totalMoneyStolen);
        printMatrix(fieldMatrix);
    }


    // FILL MATRIX
    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split(" ");
        }
    }


    // PRINT MATRIX
    private static void printMatrix(String[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }


}

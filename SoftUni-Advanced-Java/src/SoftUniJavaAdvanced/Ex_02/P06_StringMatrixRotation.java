package SoftUniJavaAdvanced.Ex_02;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get rotation
        int rotationInput = 0;
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        while (matcher.find()) {
            rotationInput = Integer.parseInt(matcher.group());
        }

        // Input word list
        List<String> inputList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            inputList.add(input);
            input = scanner.nextLine();
        }

        // Get size of matrix
        int rows = inputList.size();
        int cols = Integer.MIN_VALUE;
        for (String element : inputList) {
            if (element.length() > cols) {
                cols = element.length();
            }
        }

        // CREATE MATRIX
        char[][] charMatrixHorizontal = new char[rows][cols];
        char[][] charMatrixVertical = new char[cols][rows];


        // ROTATE MATRIX
        int rotationSteps = (rotationInput / 90) % 4;
        switch (rotationSteps) {

            // 0 degree
            case 0:
                padMatrixHorizontal(charMatrixHorizontal, rows, cols);
                fillMatrix0(charMatrixHorizontal, inputList);
                printMatrixHorizontal(charMatrixHorizontal);
                break;

            // 90 degree
            case 1:
                padMatrixVertical(charMatrixVertical, rows, cols);
                fillMatrix90(charMatrixVertical, inputList);
                printMatrixVertical(charMatrixVertical);
                break;

            // 180 degree
            case 2:
                padMatrixHorizontal(charMatrixHorizontal, rows, cols);
                fillMatrix180(charMatrixHorizontal, inputList);
                printMatrixHorizontal(charMatrixHorizontal);
                break;

            // 270 degree
            case 3:
                padMatrixVertical(charMatrixVertical, rows, cols);
                fillMatrix270(charMatrixVertical, inputList);
                printMatrixVertical(charMatrixVertical);
                break;
        }

    }


    // -- FILL METHODS --
    private static void fillMatrix0(char[][] matrix, List<String> inputList) {
        for (int row = 0; row < inputList.size(); row++) {
            char[] charArray = inputList.get(row).toCharArray();
            for (int col = 0; col < charArray.length; col++) {
                matrix[row][col] = charArray[col];
            }
        }
    }


    private static void fillMatrix90(char[][] matrix, List<String> inputList) {
        int directionInputList = inputList.size() - 1;
        for (int col = 0; col < matrix[0].length; col++, directionInputList--) {
            char[] charArray = inputList.get(directionInputList).toCharArray();
            for (int row = 0; row < charArray.length; row++) {
                matrix[row][col] = charArray[row];
            }
        }
    }


    private static void fillMatrix180(char[][] matrix, List<String> inputList) {
        int counterBottomToTop = 0;
        for (int row = matrix.length - 1; row >= 0; row--, counterBottomToTop++) {
            char[] charArray = inputList.get(counterBottomToTop).toCharArray();
            int counterPutInReverse = 0;
            for (int col = matrix[row].length - 1; col >= matrix[0].length - charArray.length; col--, counterPutInReverse++) {
                matrix[row][col] = charArray[counterPutInReverse];
            }

        }
    }


    private static void fillMatrix270(char[][] matrix, List<String> inputList) {
        int listRowIndex = 0;
        for (int col = 0; col < matrix[0].length; col++, listRowIndex++) {
            char[] charArray = inputList.get(listRowIndex).toCharArray();
            int counterChar= 0;
            for (int row = matrix.length - 1; row >= matrix.length - charArray.length; row--, counterChar++) {
                matrix[row][col] = charArray[counterChar];
            }
        }
    }


    // -- PAD METHODS --
    private static void padMatrixHorizontal(char[][] matrix, int rows, int cols) {
        // Pad matrix
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = ' ';
            }
        }
    }


    private static void padMatrixVertical(char[][] matrix, int rows, int cols) {
        // Pad matrix
        for (int row = 0; row < cols; row++) {
            for (int col = 0; col < rows; col++) {
                matrix[row][col] = ' ';
            }
        }
    }


    // -- PRINT METHODS --
    private static void printMatrixHorizontal(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void printMatrixVertical(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }


}

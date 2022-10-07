package SoftUniJavaFundamentals.Lab_04;

import java.util.Scanner;

public class P06_CalculateRectangleArea_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthInput = Integer.parseInt(scanner.nextLine());
        int lengthInput = Integer.parseInt(scanner.nextLine());

        int area = calculateArea(widthInput, lengthInput);
        System.out.println(area);
    }

    public static int calculateArea(int width, int length){
        return width * length;
    }

}

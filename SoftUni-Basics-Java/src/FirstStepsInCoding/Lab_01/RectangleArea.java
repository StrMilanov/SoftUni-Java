package FirstStepsInCoding.Lab_01;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        int a = Integer.parseInt(keyScan.nextLine());
        int b = Integer.parseInt(keyScan.nextLine());
        int area = a * b;

        System.out.println(area);
    }
}

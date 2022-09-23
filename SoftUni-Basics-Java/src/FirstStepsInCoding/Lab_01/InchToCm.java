package FirstStepsInCoding.Lab_01;

import java.util.Scanner;

public class InchToCm {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        double cm = 2.54;

        double num1 = Double.parseDouble(keyScan.nextLine());
        double num2 = num1 * cm;

        System.out.println(num2);
    }
}

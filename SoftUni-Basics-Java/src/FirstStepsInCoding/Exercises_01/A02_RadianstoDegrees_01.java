package FirstStepsInCoding.Exercises_01;

import java.util.Scanner;

public class A02_RadianstoDegrees_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radian = Double.parseDouble(scanner.nextLine());

        double degree = radian * 180 / Math.PI;

        System.out.println(degree);
    }
}

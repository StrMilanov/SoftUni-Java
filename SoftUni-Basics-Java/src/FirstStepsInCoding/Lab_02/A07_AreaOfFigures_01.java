package FirstStepsInCoding.Lab_02;

import java.util.Scanner;

public class A07_AreaOfFigures_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double faceSquare = sideA * sideA;
            System.out.printf("%.3f", faceSquare);

        } else if (figure.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            double faceRectangle = sideA * sideB;
            System.out.printf("%.3f", faceRectangle);

        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            double faceCircle = Math.PI * r * r;
            System.out.printf("%.3f", faceCircle);

        } else if (figure.equals("triangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            double faceTriangle = sideA * h / 2;
            System.out.printf("%.3f", faceTriangle);

        }
    }
}

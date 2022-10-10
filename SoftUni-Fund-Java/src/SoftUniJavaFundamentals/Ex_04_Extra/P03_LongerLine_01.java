package SoftUniJavaFundamentals.Ex_04_Extra;

import java.util.Scanner;

public class P03_LongerLine_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int line1X1 = Integer.parseInt(scanner.nextLine());
        int line1Y1 = Integer.parseInt(scanner.nextLine());
        int line1X2 = Integer.parseInt(scanner.nextLine());
        int line1Y2 = Integer.parseInt(scanner.nextLine());
        int line2X1 = Integer.parseInt(scanner.nextLine());
        int line2Y1 = Integer.parseInt(scanner.nextLine());
        int line2X2 = Integer.parseInt(scanner.nextLine());
        int line2Y2 = Integer.parseInt(scanner.nextLine());

        double line1 = getLineLength(line1X1, line1Y1, line1X2, line1Y2);
        double line2 = getLineLength(line2X1, line2Y1, line2X2, line2Y2);

        if (line1 >= line2) {
            printLongerLine(line1X1, line1Y1, line1X2, line1Y2);
        } else {
            printLongerLine(line2X1, line2Y1, line2X2, line2Y2);
        }

    }

    public static double getLineLength(int x1, int y1, int x2, int y2) {
        // Distance: d = Math.sqrt( (x2 - x1)^2 + (y2 - y1)^2 )
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void printLongerLine(int x1, int y1, int x2, int y2) {
        double linePart1 = Math.sqrt(Math.pow(Math.abs(x1), 2) + Math.pow(Math.abs(y1), 2));
        double linePart2 = Math.sqrt(Math.pow(Math.abs(x2), 2) + Math.pow(Math.abs(y2), 2));
        if (linePart1 <= linePart2) {
            System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
        } else {
            System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
        }
    }

}

package SoftUniJavaFundamentals.Lab_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08_MathPower_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(numToPowerOf(num, power)));
    }

    public static double numToPowerOf(double n, double pow) {
        double sum = 1;
        for (int i = 1; i <= pow; i++) {
            sum *= n;
        }
        return sum;
    }


}

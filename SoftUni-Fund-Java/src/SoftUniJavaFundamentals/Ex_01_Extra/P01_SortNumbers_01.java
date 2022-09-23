package SoftUniJavaFundamentals.Ex_01_Extra;

import java.util.Scanner;

public class P01_SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double mid = 0;

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        double n3 = Double.parseDouble(scanner.nextLine());

        // MAX
        if (n1 > max) {
            max = n1;
        }
        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }

        // MIN
        if (n1 < min) {
            min = n1;
        }
        if (n2 < min) {
            min = n2;
        }
        if (n3 < min) {
            min = n3;
        }

        // MID
        if (n1 == n2 || n1 == n3){
            mid = n1;
        }
        if (n2 == n1 || n2 == n3){
            mid = n2;
        }
        if (n3 == n1 || n3 == n2){
            mid = n3;
        }


        if (n1 < max && n1 > min) {
            mid = n1;
        }
        if (n2 < max && n2 > min) {
            mid = n2;
        }
        if (n3 < max && n3 > min) {
            mid = n3;
        }


        System.out.printf("%.0f\n", max);
        System.out.printf("%.0f\n", mid);
        System.out.printf("%.0f\n", min);

    }
}

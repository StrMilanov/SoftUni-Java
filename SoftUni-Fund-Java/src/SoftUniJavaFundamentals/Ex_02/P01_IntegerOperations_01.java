package SoftUniJavaFundamentals.Ex_02;

import java.util.Scanner;

public class P01_IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n4 = Integer.parseInt(scanner.nextLine());

        int sum = ((n1 + n2) / n3) * n4;

        System.out.println(sum);

    }
}

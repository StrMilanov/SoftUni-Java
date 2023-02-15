package SoftUniJavaAdvanced.Ex_08.P06_GenericCountMethodDouble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<Double> box = new Box<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            double input = Double.parseDouble(scanner.nextLine());
            box.add(input);
        }

        double element = Double.parseDouble(scanner.nextLine());

        // Output
        System.out.println(box.compare(element));

    }
}

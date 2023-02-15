package SoftUniJavaAdvanced.Ex_08.P03_GenericSwapMethodString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<String> boxOfT = new Box<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            boxOfT.add(input);
        }

        int indexOne = scanner.nextInt();
        int indexTwo = scanner.nextInt();

        boxOfT.swapPlaces(indexOne, indexTwo);

        // Output
        System.out.println(boxOfT.toString());
    }
}

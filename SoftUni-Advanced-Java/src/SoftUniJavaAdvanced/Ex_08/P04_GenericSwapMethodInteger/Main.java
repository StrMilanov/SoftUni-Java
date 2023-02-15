package SoftUniJavaAdvanced.Ex_08.P04_GenericSwapMethodInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<Integer> boxOfT = new Box<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());;
            boxOfT.add(input);
        }

        int indexOne = scanner.nextInt();
        int indexTwo = scanner.nextInt();

        boxOfT.swapPlaces(indexOne, indexTwo);

        // Output
        System.out.println(boxOfT.toString());

    }
}

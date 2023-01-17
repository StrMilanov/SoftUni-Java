package SoftUniJavaAdvanced.Ex_01;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01_ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> intStack = new ArrayDeque<>();

        String[] input = scanner.nextLine().split("\\s+");

        for (String num : input) {
            intStack.push(Integer.parseInt(num));
        }

        while (!intStack.isEmpty()) {
            System.out.print(intStack.pop() + " ");
        }

    }
}

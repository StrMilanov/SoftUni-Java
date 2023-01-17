package SoftUniJavaAdvanced.Ex_01;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> intStack = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            switch (input[0]) {
                case "1":
                    int numToPush = Integer.parseInt(input[1]);
                    intStack.push(numToPush);
                    break;

                case "2":
                    intStack.pop();
                    break;

                case "3":
                    int numMax = Integer.MIN_VALUE;
                    ArrayDeque<Integer> copyStack = intStack.clone();
                    while (!copyStack.isEmpty()){
                        int currentNum = copyStack.pop();
                        if (currentNum > numMax) {
                            numMax = currentNum;
                        }
                    }
                    System.out.println(numMax);
                    break;
            }
        }

    }
}

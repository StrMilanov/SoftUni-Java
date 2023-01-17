package SoftUniJavaAdvanced.Ex_01;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();          // N - number of elements to push into the stack
        int S = scanner.nextInt();          // S - number of elements to pop from the stack
        int X = scanner.nextInt();          // X - an element that you should check whether is present in the stack

        int minNum = Integer.MAX_VALUE;

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            stack.push(scanner.nextInt());
        }

        for (int i = 0; i < S; i++) {
            stack.pop();
        }

        // OUTPUT
        if (stack.isEmpty()) {
            System.out.println(0);
        } else {
            for (int num : stack) {
                if (X == num) {
                    System.out.println("true");
                    return;
                } else {
                    if (num < minNum) {
                        minNum = num;
                    }
                }
                stack.pop();
            }

            System.out.println(minNum);
        }

    }
}

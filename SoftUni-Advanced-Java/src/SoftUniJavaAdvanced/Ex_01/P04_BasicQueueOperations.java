package SoftUniJavaAdvanced.Ex_01;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();          // N - number of elements to enqueue (add)
        int S = scanner.nextInt();          // S - number of elements to dequeue (remove/poll) from the queue
        int X = scanner.nextInt();          // X - an element that you should check whether is present in the queue

        ArrayDeque<Integer> intQueue = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            intQueue.offer(scanner.nextInt());
        }

        for (int i = 0; i < S; i++) {
            intQueue.poll();
        }


        // OUTPUT
        if (intQueue.isEmpty()) {
            System.out.println(0);
        } else {
            int minNum = Integer.MAX_VALUE;
            for (int num : intQueue) {
                if (X == num) {
                    System.out.println("true");
                    return;
                } else {
                    if (num < minNum) {
                        minNum = num;
                    }
                }
            }
            System.out.println(minNum);
        }

    }
}

package SoftUniJavaAdvanced.Lab_01;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> printQueue = new ArrayDeque<>();

        String input = scanner.nextLine();
        while (!input.equals("print")) {

            if (input.equals("cancel")) {
                if (printQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printQueue.poll());
                }

            } else {
                printQueue.offer(input);
            }

            input = scanner.nextLine();
        }

        if (!printQueue.isEmpty()) {
            while (!printQueue.isEmpty()) {
                System.out.println(printQueue.poll());
            }
        }

    }
}

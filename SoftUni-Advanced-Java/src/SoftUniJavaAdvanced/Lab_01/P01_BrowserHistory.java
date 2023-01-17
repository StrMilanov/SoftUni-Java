package SoftUniJavaAdvanced.Lab_01;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();

        String url = "";

        String input = scanner.nextLine();
        while (!input.equals("Home")) {
            if (input.equals("back")) {

                if (history.size() <= 1) {
                    System.out.println("no previous URLs");

                } else {
                    history.pop();
                    url = history.peek();
                    System.out.println(url);
                }

            } else {
                url = input;
                history.push(url);
                System.out.println(url);
            }

            input = scanner.nextLine();
        }

    }
}

package FirstStepsInCoding.Lab_05;

import java.util.Scanner;

public class P07_MinNumber_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int minNum = Integer.MAX_VALUE;

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            num = Integer.parseInt(input);

            if (num < minNum) {
                minNum = num;
            }

            input = scanner.nextLine();
        }

        System.out.println(minNum);
    }
}

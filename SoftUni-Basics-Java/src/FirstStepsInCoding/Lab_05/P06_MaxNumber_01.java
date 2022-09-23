package FirstStepsInCoding.Lab_05;

import java.util.Scanner;

public class P06_MaxNumber_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int maxNum = Integer.MIN_VALUE;

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            num = Integer.parseInt(input);

            if (num > maxNum) {
                maxNum = num;
            }

            input = scanner.nextLine();
        }

        System.out.println(maxNum);

    }
}

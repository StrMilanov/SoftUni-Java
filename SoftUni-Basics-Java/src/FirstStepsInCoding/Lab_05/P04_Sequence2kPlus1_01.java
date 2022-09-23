package FirstStepsInCoding.Lab_05;

import java.util.Scanner;

public class P04_Sequence2kPlus1_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int newNum = 1;

        while (newNum <= n) {
            System.out.println(newNum);
            newNum = newNum * 2 + 1;
        }

    }
}

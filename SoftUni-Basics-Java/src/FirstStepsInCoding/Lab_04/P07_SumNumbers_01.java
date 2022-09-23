package FirstStepsInCoding.Lab_04;

import java.util.Scanner;

public class P07_SumNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAmount = Integer.parseInt(scanner.nextLine());
        int numTotal = 0;

        for (int i = 1; i <= numAmount; i++){
            int numNext = Integer.parseInt(scanner.nextLine());
            numTotal += numNext;
        }

        System.out.println(numTotal);
    }
}

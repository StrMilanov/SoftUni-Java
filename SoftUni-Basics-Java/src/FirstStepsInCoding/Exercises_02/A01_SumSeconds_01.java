package FirstStepsInCoding.Exercises_02;

import java.util.Scanner;

public class A01_SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeSecA = Integer.parseInt(scanner.nextLine());
        int timeSecB = Integer.parseInt(scanner.nextLine());
        int timeSecC = Integer.parseInt(scanner.nextLine());

        int timeSecTotal = timeSecA + timeSecB + timeSecC;

        int minTotal = timeSecTotal / 60;
        int secTotal = timeSecTotal % 60;

        System.out.printf("%d:%02d", minTotal, secTotal);

    }
}

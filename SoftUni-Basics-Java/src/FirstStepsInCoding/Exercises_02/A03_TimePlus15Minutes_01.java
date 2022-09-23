package FirstStepsInCoding.Exercises_02;

import java.util.Scanner;

public class A03_TimePlus15Minutes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourIn = Integer.parseInt(scanner.nextLine());
        int minIn = Integer.parseInt(scanner.nextLine());

        int minTotal = hourIn * 60 + minIn + 15;

        int hour = minTotal / 60;
        int min = minTotal % 60;

        if (hour > 23) {
            hour = 0;
        }

        if (min > 59) {
            min = 0;
        }

        System.out.printf("%d:%02d", hour, min);
    }
}

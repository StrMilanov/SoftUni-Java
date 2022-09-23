package SoftUniJavaFund.Lab_01;

import java.util.Scanner;

public class P04_BackIn30Minutes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutesPlus30 = hours * 60 + minutes + 30;

        int hoursNew = totalMinutesPlus30 / 60;
        int minutesNew = totalMinutesPlus30 % 60;

        if (hoursNew >= 23){
            hoursNew = 0;
        }

        System.out.printf("%d:%02d", hoursNew, minutesNew);

    }
}

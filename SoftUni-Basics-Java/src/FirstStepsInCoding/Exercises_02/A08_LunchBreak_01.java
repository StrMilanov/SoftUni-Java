package FirstStepsInCoding.Exercises_02;

import java.util.Scanner;

public class A08_LunchBreak_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameShow = scanner.nextLine();
        int timeShow = Integer.parseInt(scanner.nextLine());
        int timeBreak = Integer.parseInt(scanner.nextLine());

        double timeLunch = timeBreak / 8.0;
        double timeRest = timeBreak / 4.0;
        double timeLeft = timeBreak - timeLunch - timeRest;

        if (timeLeft >= timeShow) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameShow, Math.ceil(timeLeft - timeShow));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameShow,Math.ceil(timeShow - timeLeft));
        }
    }
}

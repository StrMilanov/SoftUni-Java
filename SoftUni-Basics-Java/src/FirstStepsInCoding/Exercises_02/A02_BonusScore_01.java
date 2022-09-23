package FirstStepsInCoding.Exercises_02;

import java.util.Scanner;

public class A02_BonusScore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = Integer.parseInt(scanner.nextLine());
        double bonus = 0.0;

        if (score <= 100) {
            bonus += 5;
        } else if (score < 1000) {
            bonus += score * 0.2;
        } else {
            bonus += score * 0.1;
        }

        double bonus2 = 0.0;
        if (score % 2 == 0) {
            bonus2 += 1;
        } else if (score % 10 == 5) {
            bonus2 += 2;
        }

        System.out.println(bonus + bonus2);
        System.out.println(score + bonus + bonus2);

    }
}

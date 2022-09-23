package FirstStepsInCoding.Exercises_04;

import java.util.Scanner;

public class P07_TrekkingMania_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountGroups = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        int countMusala = 0;
        int countMontblanc = 0;
        int countKilimanjaro = 0;
        int countK2 = 0;
        int countEverest = 0;
        int totalPeople = 0;

        for (int i = 1; i <= amountGroups; i++) {
            int peopleInCurrentGroup = Integer.parseInt(scanner.nextLine());
            totalPeople += peopleInCurrentGroup;

            if (peopleInCurrentGroup <= 5) {
                countMusala += peopleInCurrentGroup;
            } else if (peopleInCurrentGroup <= 12) {
                countMontblanc += peopleInCurrentGroup;
            } else if (peopleInCurrentGroup <= 25) {
                countKilimanjaro += peopleInCurrentGroup;
            } else if (peopleInCurrentGroup <= 40) {
                countK2 += peopleInCurrentGroup;
            } else {
                countEverest += peopleInCurrentGroup;
            }
        }

        p1 = 1.0 * countMusala / totalPeople * 100;
        p2 = 1.0 * countMontblanc / totalPeople * 100;
        p3 = 1.0 * countKilimanjaro / totalPeople * 100;
        p4 = 1.0 * countK2 / totalPeople * 100;
        p5 = 1.0 * countEverest / totalPeople * 100;

        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%", p1, p2, p3, p4, p5);

    }
}

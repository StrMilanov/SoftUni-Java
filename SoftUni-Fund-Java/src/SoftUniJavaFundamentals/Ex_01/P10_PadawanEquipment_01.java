package SoftUniJavaFund.Ex_01;

import java.util.Scanner;

public class P10_PadawanEquipment_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double lightsabersCount = 0;
        double beltsPriceTotal = 0;
        double sumTotal = 0;

        lightsabersCount = studentsCount + Math.ceil(studentsCount * 0.1);

        beltsPriceTotal = beltPrice * (studentsCount - Math.floor(studentsCount / 6.0));

        sumTotal = (studentsCount * robePrice) + (lightsabersCount * lightsaberPrice) + beltsPriceTotal;

        if (sumTotal <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", sumTotal);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", sumTotal - budget);
        }

    }
}


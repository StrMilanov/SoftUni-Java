package FirstStepsInCoding.Exercises_04;

import java.util.Scanner;

public class P06_Oscars_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameActor = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int amountJury = Integer.parseInt(scanner.nextLine());

        double pointsMax = 1250.5;
        double pointsTotal = 0;
        double pointsCurrentJuryTotal = 0;

        pointsTotal+=pointsAcademy;

        for (int i = 1; i <= amountJury; i++) {
            String nameJury = scanner.nextLine();
            double pointsJury = Double.parseDouble(scanner.nextLine());
            pointsCurrentJuryTotal = nameJury.length() * pointsJury / 2;
            pointsTotal += pointsCurrentJuryTotal;

            if (pointsTotal >= pointsMax){
                System.out.printf("\nCongratulations, %s got a nominee for leading role with %.1f!", nameActor, pointsTotal);
                break;
            }
        }

        if (pointsTotal < pointsMax){
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, pointsMax - pointsTotal);
        }

    }
}

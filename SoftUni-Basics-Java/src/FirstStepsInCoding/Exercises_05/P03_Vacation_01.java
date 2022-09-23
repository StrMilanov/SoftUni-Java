package FirstStepsInCoding.Exercises_05;

import java.util.Scanner;

public class P03_Vacation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTrip = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int counterDaysTotal = 0;
        int counterSpendDays = 0;
        boolean cantSave = false;


        while (money < priceTrip) {
            String action = scanner.nextLine();
            double inputMoney = Double.parseDouble(scanner.nextLine());
            counterDaysTotal++;

            switch (action) {
                case "spend":
                    counterSpendDays++;
                    money -= inputMoney;
                    if (money < 0) {
                        money = 0;
                    }
                    break;
                case "save":
                    counterSpendDays = 0;
                    money += inputMoney;
                    break;
            }

            if (counterSpendDays == 5) {
                cantSave = true;
                break;
            }

        }

        if (cantSave) {
            System.out.printf("You can't save the money.\n%d", counterDaysTotal);
        } else {
            System.out.printf("You saved the money for %d days.", counterDaysTotal);
        }

    }
}

package SoftUniJavaFundamentals.Exam_Mid;

import java.util.Scanner;

public class P02_SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split("\\|\\|");
        int startFuel = Integer.parseInt(scanner.nextLine());
        int startAmmo = Integer.parseInt(scanner.nextLine());

        int totalFuel = startFuel;
        int totalAmmo = startAmmo;
        boolean isMissionFailed = false;
        boolean isMissionSuccess = false;

        for (int i = 0; i < inputArray.length; i++) {
            String[] command = inputArray[i].split("\\s+");
            switch (command[0]) {
                case "Travel":
                    int distanceLy = Integer.parseInt(command[1]);
                    if (totalFuel >= distanceLy) {
                        totalFuel -= distanceLy;
                        System.out.printf("The spaceship travelled %d light-years.\n", distanceLy);
                    } else {
                        isMissionFailed = true;
                    }
                    break;

                case "Enemy":
                    int enemyArmor = Integer.parseInt(command[1]);
                    if (totalAmmo >= enemyArmor) {
                        totalAmmo -= enemyArmor;
                        System.out.printf("An enemy with %d armour is defeated.\n", enemyArmor);
                    } else if (totalFuel >= enemyArmor * 2) {
                        totalFuel -= enemyArmor * 2;
                        System.out.printf("An enemy with %d armour is outmaneuvered.\n", enemyArmor);
                    } else {
                        isMissionFailed = true;
                    }
                    break;

                case "Repair":
                    int restockAmount = Integer.parseInt(command[1]);
                    totalFuel += restockAmount;
                    totalAmmo += restockAmount * 2;
                    System.out.printf("Ammunitions added: %d.\nFuel added: %d.\n", restockAmount * 2, restockAmount);
                    break;

                case "Titan":
                    isMissionSuccess = true;
                    break;
            }

            // --- MISSION FAILED ---
            if (isMissionFailed) {
                System.out.println("Mission failed.");
                break;
            }

            // --- MISSION SUCCESS ---
            if (isMissionSuccess){
                System.out.println("You have reached Titan, all passengers are safe.");
                break;
            }

        }

    }
}

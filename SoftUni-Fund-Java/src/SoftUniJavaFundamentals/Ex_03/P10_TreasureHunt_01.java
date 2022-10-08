package SoftUniJavaFundamentals.Ex_03;

import java.util.Arrays;
import java.util.Scanner;

public class P10_TreasureHunt_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] chestArray = scanner.nextLine().split("\\|");
        String[] chestArrayUpdate = chestArray;

        double treasureSum = 0;
        boolean isEmpty = false;

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {

            if (command.contains("Loot")) {
                String[] newLootArray = command.split(" ");
                // Read looted items and compare
                for (int i = 1; i < newLootArray.length; i++) {
                    boolean isContained = false;
                    for (int j = 0; j < chestArray.length; j++) {
                        if (chestArray[j].equals(newLootArray[i])) {
                            isContained = true;
                            break;
                        }
                    }

                    // Add new items to chest
                    if (!isContained) {
                        String[] tempChestArray = new String[chestArray.length + 1];
                        tempChestArray[0] = newLootArray[i];
                        for (int k = 1; k < tempChestArray.length; k++) {
                            tempChestArray[k] = chestArray[k - 1];
                        }
                        chestArray = tempChestArray;
                    }

                }
//                System.out.println("Loot: " + Arrays.toString(chestArray));             // TEST PRINT
            }


            if (command.contains("Drop")) {
                int dropPosition = Integer.parseInt(command.split(" ")[1]);

                if (dropPosition >= 0 && dropPosition <= chestArray.length - 1) {
                    String droppedItem = chestArray[dropPosition];
                    for (int i = dropPosition; i < chestArray.length - 1; i++) {
                        chestArray[i] = chestArray[i + 1];
                    }
                    chestArray[chestArray.length - 1] = droppedItem;

//                    System.out.println("Drop: " + Arrays.toString(chestArray));              // TEST PRINT
                }
            }


            if (command.contains("Steal")) {
                int stolenCount = Integer.parseInt(command.split(" ")[1]);
                String[] stolenItemsArray = new String[stolenCount];

                if (stolenCount < chestArray.length) {
                    for (int i = 0; i <= stolenItemsArray.length - 1; i++) {
                        stolenItemsArray[i] = chestArray[chestArray.length - stolenCount + i];
                    }

                    chestArrayUpdate = new String[chestArray.length - stolenCount];
                    for (int i = 0; i <= chestArrayUpdate.length - 1; i++) {
                        chestArrayUpdate[i] = chestArray[i];
                    }

                    chestArray = chestArrayUpdate;

                } else {
                    stolenItemsArray = chestArray;
                    isEmpty = true;
                }

                // PRINT Stolen Items
                System.out.println(String.join(", ", stolenItemsArray));
            }

            command = scanner.nextLine();
        }

        // PRINT Results
        if (isEmpty) {
            System.out.println("Failed treasure hunt.");
        } else {

            for (int i = 0; i <= chestArray.length - 1; i++) {
                treasureSum += chestArray[i].length();
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.", treasureSum / chestArray.length);

        }
    }
}

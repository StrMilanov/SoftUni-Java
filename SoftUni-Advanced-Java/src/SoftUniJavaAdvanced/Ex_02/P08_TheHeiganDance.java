package SoftUniJavaAdvanced.Ex_02;

import java.util.Scanner;

public class P08_TheHeiganDance {
    private static final String SPLIT_REGEX = "\\s+";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arena = new int[15][15];
        double bossHP = 3000000;
        String lastSpell = "";

        int playerHP = 18500;
        int playerRow = 7;
        int playerCol = 7;

        double playerDMG = Double.parseDouble(scanner.nextLine());

        while (playerHP > 0 && bossHP > 0) {
            String[] input = scanner.nextLine().split(SPLIT_REGEX);
            String currentSpell = input[0];
            int spellRow = Integer.parseInt(input[1]);
            int spellCol = Integer.parseInt(input[2]);

            // Boss takes DMG
            bossHP -= playerDMG;

            // Player takes DMG if poisoned
            if (lastSpell.equals("Cloud")) {
                playerHP -= 3500;
            }

            if (playerHP <= 0 || bossHP <=0){
                break;
            }

            if (isPositionInAOE(playerRow, playerCol, spellRow, spellCol)) {

                // MOVE UP
                if (playerRow > 0 && !isPositionInAOE(playerRow - 1, playerCol, spellRow, spellCol)) {
                    playerRow--;
                    lastSpell = "";

                    // MOVE RIGHT
                } else if (playerCol < 14 && !isPositionInAOE(playerRow, playerCol + 1, spellRow, spellCol)) {
                    playerCol++;
                    lastSpell = "";

                    // MOVE DOWN
                } else if (playerRow < 14 && !isPositionInAOE(playerRow + 1, playerCol, spellRow, spellCol)) {
                    playerRow++;
                    lastSpell = "";

                    // MOVE LEFT
                } else if (playerCol > 0 && !isPositionInAOE(playerRow, playerCol - 1, spellRow, spellCol)) {
                    playerCol--;
                    lastSpell = "";

                    // STAY AND TAKE DMG
                } else {
                    switch (currentSpell) {
                        case "Cloud":
                            playerHP -= 3500;
                            lastSpell = "Cloud";
                            break;
                        case "Eruption":
                            playerHP -= 6000;
                            lastSpell = "Eruption";
                            break;
                    }
                }

            }
        }


        // OUTPUT
        if (bossHP <= 0) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f%n", bossHP);
        }

        if (playerHP <= 0) {
            if (lastSpell.equals("Cloud")) {
                lastSpell = "Plague Cloud";
            }
            System.out.printf("Player: Killed by %s%n", lastSpell);
        } else {
            System.out.printf("Player: %d%n", playerHP);
        }

        System.out.printf("Final position: %d, %d%n", playerRow, playerCol);

    }


    private static boolean isPositionInAOE(int playerRow, int playerCol, int spellRow, int spellCol) {
        boolean isInAOE = playerRow >= spellRow - 1 && playerRow <= spellRow + 1 && playerCol >= spellCol - 1 && playerCol <= spellCol + 1;
        return isInAOE;
    }

}

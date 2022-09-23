package FirstStepsInCoding.TestExam_July2020;

import java.util.Scanner;

public class P05_BestPlayer_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bestPlayer = "";
        int bestScore = Integer.MIN_VALUE;
        boolean hatTrick = false;

        String playerName = scanner.nextLine();
        while (!playerName.equals("END")){
            int goalsScored = Integer.parseInt(scanner.nextLine());

            if (goalsScored > bestScore){
                bestPlayer = playerName;
                bestScore = goalsScored;
            }

            if (goalsScored >= 3){
                hatTrick = true;
            }

            if (goalsScored >= 10){
                break;
            }

            playerName = scanner.nextLine();
        }

        System.out.println(bestPlayer + " is the best player!");

        if (hatTrick){
            System.out.printf("He has scored %d goals and made a hat-trick !!!", bestScore);
        } else {
            System.out.printf("He has scored %d goals.", bestScore);
        }

    }
}

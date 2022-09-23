package FirstStepsInCoding.Exercises_05;

import java.util.Scanner;

public class P06_Cake_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int piecesTotal = width * length;
        boolean outOfCake = false;
        int piecesRequired = 0;

        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            int pieces = Integer.parseInt(input);
            piecesTotal -= pieces;

            if (piecesTotal <= 0) {
                outOfCake = true;
                piecesRequired = Math.abs(piecesTotal);
                break;
            }

            input = scanner.nextLine();
        }

        if (outOfCake) {
            System.out.printf("No more cake left! You need %d pieces more.", piecesRequired);
        } else {
            System.out.printf("%d pieces are left.", piecesTotal);
        }

    }
}

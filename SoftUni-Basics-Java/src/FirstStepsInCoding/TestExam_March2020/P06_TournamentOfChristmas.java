package FirstStepsInCoding.TestExam_March2020;

import java.util.Scanner;

public class P06_TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String nameSport = "";
        String status = "";
        double moneyTotalPerDay = 0;
        double moneyTotalAll = 0;
        int counterWin = 0;
        int counterLose = 0;
        int counterWinnerOfDay = 0;

        for (int i = 1; i <= days; i++) {

            String input = scanner.nextLine();
            while (!input.equals("Finish")) {
                nameSport = input;

                status = scanner.nextLine();
                switch (status) {
                    case "win":
                        counterWin++;
                        moneyTotalPerDay += 20;
                        break;
                    case "lose":
                        counterLose++;
                        break;
                }

                input = scanner.nextLine();
            }

            if (counterWin > counterLose) {
                counterWinnerOfDay++;
                moneyTotalPerDay += moneyTotalPerDay * 0.1;
            }

            moneyTotalAll += moneyTotalPerDay;
            moneyTotalPerDay = 0;
            counterWin = 0;
            counterLose = 0;
        }

        if (counterWinnerOfDay > days / 2) {
            moneyTotalAll += moneyTotalAll * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", moneyTotalAll);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", moneyTotalAll);
        }

    }
}

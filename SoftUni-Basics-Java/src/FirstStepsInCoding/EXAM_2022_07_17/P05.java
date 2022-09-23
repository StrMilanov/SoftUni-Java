package FirstStepsInCoding.EXAM_2022_07_17;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int reached = 5364;
        int goal = 8848;
        int currentClimbed = 0;
        int counterDays = 1;
        boolean goalIsReached = false;

        String choice = scanner.nextLine();
        while (!choice.equals("END")) {
            switch (choice) {
                case "Yes":
                    counterDays++;
                    break;
                case "No":
                    break;
            }

            if (counterDays > 5){
                break;
            }

            currentClimbed = Integer.parseInt(scanner.nextLine());
            reached += currentClimbed;
            if (reached >= goal) {
                goalIsReached = true;
                break;
            }

            choice = scanner.nextLine();
        }

        if (!goalIsReached){
            System.out.printf("Failed!\n%d", reached);
        } else {
            System.out.printf("Goal reached for %d days!", counterDays);
        }


    }
}

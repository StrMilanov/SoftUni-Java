package FirstStepsInCoding.Exercises_04;

import java.util.Scanner;

public class P05_Salary_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int fineFacebook = 150;
        int fineInstagram = 100;
        int fineReddit = 50;

        for (int i = 1; i <= amountTabs; i++) {
            String tabName = scanner.nextLine();
            switch (tabName) {
                case "Facebook":
                    salary -= fineFacebook;
                    break;
                case "Instagram":
                    salary -= fineInstagram;
                    break;
                case "Reddit":
                    salary -= fineReddit;
                    break;
            }

            if (salary <= 0){
                System.out.println("You have lost your salary.");
                return;
            }
        }

        System.out.println(salary);
    }
}

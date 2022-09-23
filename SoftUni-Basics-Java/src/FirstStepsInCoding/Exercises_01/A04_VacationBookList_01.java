package FirstStepsInCoding.Exercises_01;

import java.util.Scanner;

public class A04_VacationBookList_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesAmount = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysAmount = Integer.parseInt(scanner.nextLine());

        int hoursPerDay = pagesAmount / pagesPerHour /daysAmount;

        System.out.println(hoursPerDay);
    }
}

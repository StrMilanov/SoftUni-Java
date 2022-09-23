package FirstStepsInCoding.EXAM_2022_07_17;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountPC = Integer.parseInt(scanner.nextLine());
        int sales = 0;
        int rating = 0;
        double sumSales = 0;
        int sumRating = 0;
        double tempSales = 0;
        double avgRating = 0;

        for (int i = 1; i <= amountPC; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sales = num / 10;
            rating = num % 10;

            switch (rating) {
                case 2:
                    tempSales = 0;
                    break;
                case 3:
                    tempSales = sales * 0.50;
                    break;
                case 4:
                    tempSales = sales * 0.70;
                    break;
                case 5:
                    tempSales = sales * 0.85;
                    break;
                case 6:
                    tempSales = sales;
                    break;
            }

            sumSales += tempSales;
            sumRating += rating;
            avgRating = 1.0 * sumRating / amountPC;

        }

        System.out.printf("%.2f\n", sumSales);
        System.out.printf("%.2f", avgRating);

    }
}

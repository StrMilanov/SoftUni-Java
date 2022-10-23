package SoftUniJavaFundamentals.Exam_Mid;

import java.math.BigInteger;
import java.util.Scanner;

public class P01_TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productionPerWorkerPerDay = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());
        int competingProduction = Integer.parseInt(scanner.nextLine());

        int productionPerMonth = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                productionPerMonth += (productionPerWorkerPerDay * workersCount) * 0.75;
            } else {
                productionPerMonth += productionPerWorkerPerDay * workersCount;
            }
        }

        System.out.printf("You have produced %d biscuits for the past month.\n", productionPerMonth);

        if (productionPerMonth > competingProduction) {
            double difference = productionPerMonth - competingProduction;
            double diffPercent = difference / competingProduction * 100;

            System.out.printf("You produce %.2f percent more biscuits.\n", diffPercent);
        } else {
            double difference = Math.abs(productionPerMonth - competingProduction);
            double diffPercent = difference / competingProduction * 100;

            System.out.printf("You produce %.2f percent less biscuits.\n", diffPercent);
        }


    }
}

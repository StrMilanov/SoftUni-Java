package SoftUniJavaFundamentals.Lab_02;

import java.util.Scanner;

public class P04_TownInfo_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cityName = scanner.nextLine();
        int cityPopulation = Integer.parseInt(scanner.nextLine());
        int cityArea = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",
                cityName,cityPopulation,cityArea);

    }
}

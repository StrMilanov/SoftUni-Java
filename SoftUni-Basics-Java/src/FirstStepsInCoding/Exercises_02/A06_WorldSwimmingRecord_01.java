package FirstStepsInCoding.Exercises_02;

import java.util.Scanner;

public class A06_WorldSwimmingRecord_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double timeRecord = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double drag = Math.floor(distanceMeters / 15) * 12.5;
        double timeIvan = distanceMeters * timePerMeter + drag;

        if (timeIvan < timeRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeIvan);
        } else if (timeIvan >= timeRecord) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeIvan - timeRecord);
        }

    }
}

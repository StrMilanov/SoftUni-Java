package SoftUniJavaFundamentals.Ex_02;

import java.util.Scanner;

public class P03_Elevator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountPeople = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());

        double totalCourses = Math.ceil(1.0 * amountPeople / elevatorCapacity);

        System.out.printf("%.0f", totalCourses);

//        int totalCourses = 0;
//
//        if (amountPeople % elevatorCapacity == 0) {
//            totalCourses = amountPeople / elevatorCapacity;
//        } else {
//            totalCourses = amountPeople / elevatorCapacity + 1;
//        }
//
//        System.out.println(totalCourses);

    }
}

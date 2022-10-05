package SoftUniJavaFundamentals.Ex_03;

import java.util.Scanner;

public class P01_Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int[] peopleArray = new int[wagons];
        int sum = 0;

        for (int i = 0; i <= peopleArray.length - 1; i++) {
            peopleArray[i] = Integer.parseInt(scanner.nextLine());
            System.out.print(peopleArray[i] + " ");
            sum += peopleArray[i];
        }

        System.out.println();
        System.out.println(sum);
    }
}

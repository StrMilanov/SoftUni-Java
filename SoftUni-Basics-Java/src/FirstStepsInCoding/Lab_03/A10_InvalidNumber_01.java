package FirstStepsInCoding.Lab_03;

import java.util.Scanner;

public class A10_InvalidNumber_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if ((num < 100 || num > 200) && num != 0){
            System.out.println("invalid");
        }

    }
}

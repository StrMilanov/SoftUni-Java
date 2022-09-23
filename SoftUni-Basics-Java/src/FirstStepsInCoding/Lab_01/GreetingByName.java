package FirstStepsInCoding.Lab_01;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        String name = keyScan.nextLine();

        System.out.printf("Hello, %s!", name);

    }
}

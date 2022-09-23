package FirstStepsInCoding.Lab_01;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameFirst = scan.nextLine();
        String nameLast = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String town = scan.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", nameFirst, nameLast, age, town);

    }
}

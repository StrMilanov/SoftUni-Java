package FirstStepsInCoding.Lab_03;

import java.util.Scanner;

public class A04_PersonalTitles_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        switch (gender) {
            case "m":
                if (age >= 16) {
                    System.out.println("Mr.");
                } else {
                    System.out.println("Master");
                }
                break;

            case "f":
                if (age >= 16) {
                    System.out.println("Ms.");
                } else {
                    System.out.println("Miss");
                }
                break;
        }
    }
}

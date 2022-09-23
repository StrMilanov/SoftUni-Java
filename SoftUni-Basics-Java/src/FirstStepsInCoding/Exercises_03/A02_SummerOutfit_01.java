package FirstStepsInCoding.Exercises_03;

import java.util.Scanner;

public class A02_SummerOutfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degC = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        switch (timeOfDay) {
            case "Morning":
                if (degC >= 10 && degC <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (degC > 18 && degC <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degC >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (degC >= 10 && degC <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degC > 18 && degC <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (degC >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                outfit = "Shirt";
                shoes = "Moccasins";
                break;
        }

        System.out.printf("It's %d degrees, get your %s and %s.", degC, outfit,shoes);

    }
}

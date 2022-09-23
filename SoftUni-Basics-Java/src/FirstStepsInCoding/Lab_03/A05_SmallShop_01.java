package FirstStepsInCoding.Lab_03;

import java.util.Scanner;

public class A05_SmallShop_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        double total = 0.0;

        switch (town) {
            case "Sofia":
                if (product.equals("coffee")) {
                    total = amount * 0.50;
                } else if (product.equals("water")) {
                    total = amount * 0.80;
                } else if (product.equals("beer")){
                    total = amount * 1.20;
                }else if (product.equals("sweets")){
                    total = amount * 1.45;
                } else if (product.equals("peanuts")){
                    total = amount * 1.60;
                }
                break;

            case "Plovdiv":
                if (product.equals("coffee")) {
                    total = amount * 0.40;
                } else if (product.equals("water")) {
                    total = amount * 0.70;
                } else if (product.equals("beer")){
                    total = amount * 1.15;
                }else if (product.equals("sweets")){
                    total = amount * 1.30;
                } else if (product.equals("peanuts")){
                    total = amount * 1.50;
                }
                break;

            case "Varna":
                if (product.equals("coffee")) {
                    total = amount * 0.45;
                } else if (product.equals("water")) {
                    total = amount * 0.70;
                } else if (product.equals("beer")){
                    total = amount * 1.10;
                }else if (product.equals("sweets")){
                    total = amount * 1.35;
                } else if (product.equals("peanuts")){
                    total = amount * 1.55;
                }
                break;

            default:
                break;
        }

        System.out.printf("%.2f", total);

    }
}

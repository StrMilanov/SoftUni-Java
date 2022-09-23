package FirstStepsInCoding.TestExam_July2020;

import java.util.Scanner;

public class P03_AluminumJoinery_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountFrame = Integer.parseInt(scanner.nextLine());
        String typeFrame = scanner.nextLine();
        String delivery = scanner.nextLine();

        double priceDelivery = 60;
        double pricePerFrame = 0;
        double total = 0;

        if (amountFrame < 10) {
            System.out.println("Invalid order");
        } else {
            switch (typeFrame) {
                case "90X130":
                    pricePerFrame = 110;
                    total = amountFrame * pricePerFrame;
                    if (amountFrame > 60) {
                        total -= total * 0.08;
                    } else if (amountFrame > 30) {
                        total -= total * 0.05;
                    }
                    break;
                case "100X150":
                    pricePerFrame = 140;
                    total = amountFrame * pricePerFrame;
                    if (amountFrame > 80) {
                        total -= total * 0.1;
                    } else if (amountFrame > 40) {
                        total -= total * 0.06;
                    }
                    break;
                case "130X180":
                    pricePerFrame = 190;
                    total = amountFrame * pricePerFrame;
                    if (amountFrame > 50) {
                        total -= total * 0.12;
                    } else if (amountFrame > 20) {
                        total -= total * 0.07;
                    }
                    break;
                case "200X300":
                    pricePerFrame = 250;
                    total = amountFrame * pricePerFrame;
                    if (amountFrame > 50) {
                        total -= total * 0.14;
                    } else if (amountFrame > 25) {
                        total -= total * 0.09;
                    }
                    break;
            }

            if (delivery.equals("With delivery")) {
                total += priceDelivery;
            }

            if (amountFrame > 99) {
                total -= total * 0.04;
            }

            System.out.printf("%.2f BGN", total);

        }

    }
}

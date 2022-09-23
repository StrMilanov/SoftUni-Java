package FirstStepsInCoding.Lab_03;

import java.util.Scanner;

public class A12_TradeCommissions_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double percent = 0.0;

        switch (town) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    percent = 5;
                } else if (sales > 500 && sales <= 1000) {
                    percent = 7;
                } else if (sales > 1000 && sales <= 10000) {
                    percent = 8;
                } else if (sales > 10000) {
                    percent = 12;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    percent = 4.5;
                } else if (sales > 500 && sales <= 1000) {
                    percent = 7.5;
                } else if (sales > 1000 && sales <= 10000) {
                    percent = 10;
                } else if (sales > 10000) {
                    percent = 13;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    percent = 5.5;
                } else if (sales > 500 && sales <= 1000) {
                    percent = 8;
                } else if (sales > 1000 && sales <= 10000) {
                    percent = 12;
                } else if (sales > 10000) {
                    percent = 14.5;
                }
                break;
            default:
                percent = 0;
                break;
        }

        double commission = sales * percent / 100;

        if (sales < 0 || percent == 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", commission);
        }

    }
}

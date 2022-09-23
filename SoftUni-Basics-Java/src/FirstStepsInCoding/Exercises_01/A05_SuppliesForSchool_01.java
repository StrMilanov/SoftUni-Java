package FirstStepsInCoding.Exercises_01;

import java.util.Scanner;

public class A05_SuppliesForSchool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePenPack = 5.80;
        double priceMarkerPack = 7.20;
        double priceCleanerLitre = 1.20;

        int amountPenPack = Integer.parseInt(scanner.nextLine());
        int amountMarkerPack = Integer.parseInt(scanner.nextLine());
        int amountCleanerLitre = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double total = amountPenPack * pricePenPack + amountMarkerPack * priceMarkerPack + amountCleanerLitre * priceCleanerLitre;
        double totalWithDiscount = total - (total * percentDiscount / 100);

        System.out.println(totalWithDiscount);
    }
}

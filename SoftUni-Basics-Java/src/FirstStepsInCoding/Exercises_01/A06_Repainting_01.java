package FirstStepsInCoding.Exercises_01;

import java.util.Scanner;

public class A06_Repainting_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceNylonPerSqM = 1.50;
        double pricePaintPerL = 14.50;
        double pricePaintThinnerPerL = 5.00;
        double priceBag = 0.40;

        int amountNylonPerSqM = Integer.parseInt(scanner.nextLine());
        int amountPaintPerL = Integer.parseInt(scanner.nextLine());
        int amountPaintThinnerPerL = Integer.parseInt(scanner.nextLine());
        int amountWorkerHours = Integer.parseInt(scanner.nextLine());

        double totalMaterials = (amountNylonPerSqM + 2) * priceNylonPerSqM
                + (amountPaintPerL * pricePaintPerL) + ((amountPaintPerL * pricePaintPerL) * 10/100 )
                + amountPaintThinnerPerL * pricePaintThinnerPerL
                + priceBag;

        double priceWorkerHours = amountWorkerHours * (totalMaterials * 30/100);

        System.out.println(totalMaterials + priceWorkerHours);
    }
}

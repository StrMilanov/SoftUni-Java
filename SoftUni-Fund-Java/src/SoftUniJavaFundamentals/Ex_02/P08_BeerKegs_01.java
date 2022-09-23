package SoftUniJavaFundamentals.Ex_02;

import java.util.Scanner;

public class P08_BeerKegs_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountKegs = Integer.parseInt(scanner.nextLine());

        double largestKegVolume = Integer.MIN_VALUE;
        String largestKegModel = "";

        for (int i = 1; i <= amountKegs; i++) {

            String kegModel = scanner.nextLine();
            double currentKegRadius = Double.parseDouble(scanner.nextLine());
            int currentKegHeight = Integer.parseInt(scanner.nextLine());

            double currentKegVolume = Math.PI * Math.pow(currentKegRadius, 2) * currentKegHeight;

            if (currentKegVolume >= largestKegVolume){
                largestKegVolume = currentKegVolume;
                largestKegModel = kegModel;
            }
        }

        System.out.println(largestKegModel);

    }
}

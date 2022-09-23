package SoftUniJavaFundamentals.Ex_02;

import java.util.Scanner;

public class P10_PokeMon_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distanceTargets = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int pokePowerMax = pokePower;
        int countPokes = 0;

        while (pokePower >= distanceTargets){

            pokePower -= distanceTargets;
            countPokes++;

            if (pokePower == pokePowerMax / 2 && pokePower > 0 && exhaustionFactor > 0){
                pokePower /=exhaustionFactor;
            }
        }

        System.out.println(pokePower);
        System.out.println(countPokes);

    }
}

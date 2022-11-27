package SoftUniJavaFundamentals.Prep_01;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // RARITY & RATING MAP
        Map<String, Integer> plantRarityMap = new LinkedHashMap<>();
        Map<String, ArrayList<Double>> plantRatingMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");
            plantRarityMap.put(input[0], Integer.parseInt(input[1]));
            plantRatingMap.put(input[0], new ArrayList<>());
        }

        // EDIT MAPS
        String splitRegex = "[:\\s+\\-]+";
        String[] command = scanner.nextLine().split(splitRegex);
        while (!command[0].equals("Exhibition")) {
            String plantName = command[1];
            if (!plantRarityMap.containsKey(plantName)) {
                System.out.println("error");
            } else {
                switch (command[0]) {
                    case "Rate":
                        double plantRating = Double.parseDouble(command[2]);
                        plantRatingMap.get(plantName).add(plantRating);
                        break;

                    case "Update":
                        int plantRarity = Integer.parseInt(command[2]);
                        plantRarityMap.put(plantName, plantRarity);
                        break;

                    case "Reset":
                        plantRatingMap.get(plantName).clear();
                        break;
                }
            }
            command = scanner.nextLine().split(splitRegex);
        }

        // PRINT OUT
        System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, Integer> entry : plantRarityMap.entrySet()) {
            String plantName = entry.getKey();
            int plantRarity = entry.getValue();
            double plantRatingAvg = 0;

            double plantRatingTotalSum = 0;
            for (double rating : plantRatingMap.get(plantName)) {
                plantRatingTotalSum += rating;
            }

            if (plantRatingTotalSum != 0) {
                plantRatingAvg = plantRatingTotalSum / plantRatingMap.get(plantName).size();
            } else {
                plantRatingAvg = 0.0;
            }

            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n", plantName, plantRarity, plantRatingAvg);
        }

    }
}

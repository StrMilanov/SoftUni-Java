package SoftUniJavaFundamentals.Prep_03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> cityPopulationMap = new LinkedHashMap<>();
        Map<String, Integer> cityGoldMap = new LinkedHashMap<>();

        // LOAD CITY DATA
        String citySplitRegex = "[|]{2}";
        String[] cityDataInput = scanner.nextLine().split(citySplitRegex);
        while (!cityDataInput[0].equals("Sail")) {
            String cityName = cityDataInput[0];
            int cityPopulation = Integer.parseInt(cityDataInput[1]);
            int cityGold = Integer.parseInt(cityDataInput[2]);

            if (cityPopulationMap.containsKey(cityName)) {
                cityPopulationMap.put(cityName, cityPopulationMap.get(cityName) + cityPopulation);
                cityGoldMap.put(cityName, cityGoldMap.get(cityName) + cityGold);
            } else {
                cityPopulationMap.put(cityName, cityPopulation);
                cityGoldMap.put(cityName, cityGold);
            }

            cityDataInput = scanner.nextLine().split(citySplitRegex);
        }

        // SAIL
        String actionSplitRegex = "=>";
        String[] action = scanner.nextLine().split(actionSplitRegex);
        while (!action[0].equals("End")) {
            String command = action[0];
            String cityName = action[1];

            if (cityPopulationMap.containsKey(cityName)) {
                switch (command) {
                    case "Plunder":
                        int peopleKilled = Integer.parseInt(action[2]);
                        int goldPlundered = Integer.parseInt(action[3]);

                        // Plunder & Kill
                        cityPopulationMap.put(cityName, cityPopulationMap.get(cityName) - peopleKilled);
                        cityGoldMap.put(cityName, cityGoldMap.get(cityName) - goldPlundered);
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", cityName, goldPlundered, peopleKilled);

                        // Destroy city
                        if (cityPopulationMap.get(cityName) <= 0 || cityGoldMap.get(cityName) <= 0) {
                            System.out.printf("%s has been wiped off the map!\n", cityName);
                            cityPopulationMap.remove(cityName);
                            cityGoldMap.remove(cityName);
                        }

                        break;

                    case "Prosper":
                        int goldAmount = Integer.parseInt(action[2]);

                        if (goldAmount >= 0) {
                            cityGoldMap.put(cityName, cityGoldMap.get(cityName) + goldAmount);
                            System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", goldAmount, cityName, cityGoldMap.get(cityName));
                        } else {
                            System.out.println("Gold added cannot be a negative number!");
                        }
                        break;
                }
            }

            action = scanner.nextLine().split(actionSplitRegex);
        }

        // OUTPUT
        if (cityPopulationMap.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", cityPopulationMap.size());
            for (Map.Entry<String, Integer> entry : cityPopulationMap.entrySet()) {
                String name = entry.getKey();
                int population = entry.getValue();
                int gold = cityGoldMap.get(entry.getKey());
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n", name, population, gold);
            }
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

    }
}

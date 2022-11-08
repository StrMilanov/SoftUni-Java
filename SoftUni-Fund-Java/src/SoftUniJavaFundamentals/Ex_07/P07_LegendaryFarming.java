package SoftUniJavaFundamentals.Ex_07;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class P07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> junkMap = new LinkedHashMap<>();
        Map<String, Integer> legendaryMap = new LinkedHashMap<>();
        legendaryMap.put("shards", 0);
        legendaryMap.put("fragments", 0);
        legendaryMap.put("motes", 0);

        boolean isLegendaryWon = false;

        while (!isLegendaryWon) {
            String[] lootInputArray = scanner.nextLine().split("\\s+");

            for (int i = 0; i < lootInputArray.length; i += 2) {
                int itemQuantity = Integer.parseInt(lootInputArray[i]);
                String itemName = lootInputArray[i + 1].toLowerCase(Locale.ROOT);

                switch (itemName) {
                    case "shards":
                    case "motes":
                    case "fragments":
                        legendaryMap.put(itemName, legendaryMap.get(itemName) + itemQuantity);
                        break;
                    default:
                        if (junkMap.containsKey(itemName)) {
                            junkMap.put(itemName, junkMap.get(itemName) + itemQuantity);
                        } else {
                            junkMap.put(itemName, itemQuantity);
                        }
                        break;
                }

                for (Map.Entry<String, Integer> entry : legendaryMap.entrySet()) {
                    if (entry.getValue() >= 250) {
                        isLegendaryWon = true;
                        legendaryMap.put(entry.getKey(), entry.getValue() - 250);
                        switch (entry.getKey()) {
                            case "shards":
                                System.out.println("Shadowmourne obtained!");
                                break;
                            case "fragments":
                                System.out.println("Valanyr obtained!");
                                break;
                            case "motes":
                                System.out.println("Dragonwrath obtained!");
                                break;
                        }
                    }
                }

                if (isLegendaryWon) {
                    break;
                }

            }

        }

        legendaryMap.entrySet().forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));
        junkMap.entrySet().forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));

    }
}


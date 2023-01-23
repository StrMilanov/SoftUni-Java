package SoftUniJavaAdvanced.Ex_03;

import java.util.*;

public class P07_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> cardPowerMap = loadCardPowerMap();
        Map<Character, Integer> cardTypeMap = loadCardTypeMap();
        Map<String, Set<String>> playerMap = new LinkedHashMap<>();
        Map<String, Integer> playerPowerMap = new LinkedHashMap<>();

        String regex = ":\\s+";

        String input = scanner.nextLine();
        while (!input.equals("JOKER")) {
            String name = input.split(regex)[0];
            playerMap.putIfAbsent(name, new HashSet<>());
            playerPowerMap.putIfAbsent(name, 0);
            String[] hand = input.split(regex)[1].split(", ");

            // Add hand to map  / may have issues /
            // Collections.addAll(playerHandMap.get(name), hand);        // Alt method
            for (String card : hand) {
                playerMap.get(name).add(card);
            }

            input = scanner.nextLine();
        }

        // Calculate power of hands
        for (Map.Entry<String, Set<String>> player : playerMap.entrySet()) {
            for (String card : player.getValue()) {
                int power = calculateCardPower(card, cardPowerMap, cardTypeMap);
                playerPowerMap.put(player.getKey(), playerPowerMap.get(player.getKey()) + power);
            }
        }


        // OUTPUT
        playerPowerMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }


    // CALCULATE CARD POWER
    private static int calculateCardPower(String card, Map<String, Integer> cardPowerMap, Map<Character, Integer> cardTypeMap) {
        String power;
        char type;
        if (card.length() > 2) {
            power = "10";
            type = card.toCharArray()[2];
        } else {
            power = card.split("")[0];
            type = card.toCharArray()[1];
        }
        return cardPowerMap.get("" + power) * cardTypeMap.get(type);
    }


    // LOAD CARD TYPE MAP
    private static Map<Character, Integer> loadCardTypeMap() {
        Map<Character, Integer> cardTypeMap = new TreeMap<>();
        cardTypeMap.put('S', 4);
        cardTypeMap.put('H', 3);
        cardTypeMap.put('D', 2);
        cardTypeMap.put('C', 1);
        return cardTypeMap;
    }


    // LOAD CARD POWER MAP
    private static Map<String, Integer> loadCardPowerMap() {
        Map<String, Integer> cardPowerMap = new TreeMap<>();
        cardPowerMap.put("J", 11);
        cardPowerMap.put("Q", 12);
        cardPowerMap.put("K", 13);
        cardPowerMap.put("A", 14);
        for (int i = 2; i <= 10; i++) {
            cardPowerMap.put(String.valueOf(i), i);
        }
        return cardPowerMap;
    }


}

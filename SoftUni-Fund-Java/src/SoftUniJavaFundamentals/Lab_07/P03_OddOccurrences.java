package SoftUniJavaFundamentals.Lab_07;

import java.util.*;

public class P03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().toLowerCase(Locale.ROOT).split("\\s+");

        Map<String, Integer> wordMap = new LinkedHashMap<>();

        for (String element : inputArray) {
            wordMap.putIfAbsent(element, 0);
            wordMap.put(element, wordMap.get(element) + 1);
        }

        List<String> oddWordsList = new ArrayList<>();
        for (var entry : wordMap.entrySet()){
            if (entry.getValue() % 2 != 0){
                oddWordsList.add(entry.getKey());
            }
        }

        System.out.println(oddWordsList.toString().replaceAll("[\\[\\]]",""));

    }
}

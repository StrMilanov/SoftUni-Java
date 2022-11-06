package SoftUniJavaFundamentals.Lab_07;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> synonymsMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            synonymsMap.putIfAbsent(word, new ArrayList<>());
            synonymsMap.get(word).add(synonym);

        }

        synonymsMap.entrySet().forEach(entry -> System.out.printf(
                "%s - %s\n", entry.getKey(), entry.getValue().toString().replaceAll("[\\[\\]]", "")));

    }
}

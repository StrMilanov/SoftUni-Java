package SoftUniJavaAdvanced.Ex_03;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> charMap = new TreeMap<>();

        char[] charArray = scanner.nextLine().toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            charMap.putIfAbsent(currentChar, 0);

            if (charMap.containsKey(charArray[i])) {
                charMap.put(currentChar, charMap.get(currentChar) + 1);
            }
        }

        // OUTPUT
        charMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s"));

    }
}

package SoftUniJavaFundamentals.Ex_07;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01_CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] charArray = scanner.nextLine().replaceAll("\\s+", "").toCharArray();

        Map<Character, Integer> charMap = new LinkedHashMap<>();

        for (char element : charArray) {
            if (!charMap.containsKey(element)) {
                charMap.put(element, 0);
            }

            charMap.put(element, charMap.get(element) + 1);
        }

        charMap.entrySet().forEach(entry -> System.out.printf("%c -> %d\n", entry.getKey(), entry.getValue()));

    }
}

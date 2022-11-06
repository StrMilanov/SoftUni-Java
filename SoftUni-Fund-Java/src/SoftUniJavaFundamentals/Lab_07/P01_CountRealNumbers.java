package SoftUniJavaFundamentals.Lab_07;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] inputArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> numCountsMap = new TreeMap<>();

        for (Double element : inputArray) {
            numCountsMap.putIfAbsent(element, 0);
            if (numCountsMap.containsKey(element)) {
                numCountsMap.put(element, numCountsMap.get(element) + 1);
            }

        }

        numCountsMap.entrySet().forEach(entry -> System.out.printf("%.0f -> %d\n", entry.getKey(), entry.getValue()));

    }
}

package SoftUniJavaFundamentals.Ex_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourceMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            String resource = input;
            int amount = Integer.parseInt(scanner.nextLine());

            resourceMap.putIfAbsent(resource, 0);
            resourceMap.put(resource, resourceMap.get(resource) + amount);

            input = scanner.nextLine();
        }

        resourceMap.entrySet().forEach(entry -> System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue()));

    }
}

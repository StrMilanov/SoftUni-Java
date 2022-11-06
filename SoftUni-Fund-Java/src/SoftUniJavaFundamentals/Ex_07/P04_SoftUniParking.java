package SoftUniJavaFundamentals.Ex_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> usersMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            switch (input[0]) {
                case "register":
                    if (!usersMap.containsKey(input[1])) {
                        usersMap.put(input[1], input[2]);
                        System.out.printf("%s registered %s successfully\n", input[1], input[2]);
                    } else {
                        System.out.println("ERROR: already registered with plate number " + usersMap.get(input[1]));
                    }
                    break;

                case "unregister":
                    if (usersMap.containsKey(input[1])) {
                        usersMap.remove(input[1]);
                        System.out.println(input[1] + " unregistered successfully");
                    } else {
                        System.out.printf("ERROR: user %s not found\n", input[1]);
                    }
                    break;
            }
        }

        usersMap.entrySet().forEach(entry -> System.out.printf("%s => %s\n", entry.getKey(), entry.getValue()));

    }
}

package SoftUniJavaAdvanced.Ex_03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> emailMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            String name = input;
            String email = scanner.nextLine();

            emailMap.put(name, email);

            input = scanner.nextLine();
        }

        emailMap.entrySet().removeIf(entry ->
                entry.getValue().endsWith("us")
                        || entry.getValue().endsWith("uk")
                        || entry.getValue().endsWith("com"));

        emailMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}

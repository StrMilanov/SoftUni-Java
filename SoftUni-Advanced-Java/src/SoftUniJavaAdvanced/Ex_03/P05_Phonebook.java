package SoftUniJavaAdvanced.Ex_03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebookMap = new LinkedHashMap<>();
        String regex = "-";

        String input = scanner.nextLine();
        while (!input.equals("search")) {
            String name = input.split(regex)[0];
            String phone = input.split(regex)[1];

            phonebookMap.put(name, phone);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("stop")){
            if (phonebookMap.containsKey(input)){
                System.out.println(input + " -> " + phonebookMap.get(input));
            } else{
                System.out.printf("Contact %s does not exist.%n", input);
            }

            input = scanner.nextLine();
        }

    }
}

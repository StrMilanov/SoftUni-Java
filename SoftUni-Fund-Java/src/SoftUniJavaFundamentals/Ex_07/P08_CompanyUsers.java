package SoftUniJavaFundamentals.Ex_07;

import java.util.*;

public class P08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> companiesMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String companyName = input.split("\\s+->\\s+")[0];
            String employeeId = input.split("\\s+->\\s+")[1];

            companiesMap.putIfAbsent(companyName, new ArrayList<>());

            for (Map.Entry<String, ArrayList<String>> entry : companiesMap.entrySet()) {
                    if (entry.getKey().equals(companyName) && !entry.getValue().contains(employeeId)) {
                        entry.getValue().add(employeeId);
                    }
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> entry : companiesMap.entrySet()) {
            System.out.println(entry.getKey());
                for (String id : entry.getValue()) {
                    System.out.println("-- " + id);
                }
        }

    }
}

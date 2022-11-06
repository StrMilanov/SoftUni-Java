package SoftUniJavaFundamentals.Ex_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double[]> orderMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String newProductName = input.split("\\s+")[0];
            Double[] newProductData = {Double.parseDouble(input.split("\\s+")[1]), Double.parseDouble(input.split("\\s+")[2])};

            if (!orderMap.containsKey(newProductName)) {
                orderMap.put(newProductName, newProductData);
            } else {
                newProductData[1] += orderMap.get(newProductName)[1];
                orderMap.put(newProductName, newProductData);
            }

            input = scanner.nextLine();
        }

        orderMap.entrySet().forEach(entry -> System.out.printf("%s -> %.2f\n",
                entry.getKey(), entry.getValue()[0] * entry.getValue()[1]));
    }
}

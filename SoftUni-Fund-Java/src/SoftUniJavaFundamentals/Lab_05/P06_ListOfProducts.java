package SoftUniJavaFundamentals.Lab_05;

import java.util.*;

public class P06_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> productsList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            productsList.add(scanner.nextLine());
        }

        Collections.sort(productsList);
        for (int i = 0; i < productsList.size(); i++) {
            System.out.printf("%d.%s\n", i+1, productsList.get(i));
        }
    }
}

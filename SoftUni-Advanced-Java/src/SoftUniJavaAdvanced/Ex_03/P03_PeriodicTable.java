package SoftUniJavaAdvanced.Ex_03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> compoundSet = new TreeSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            compoundSet.addAll(Arrays.asList(line));
        }

        compoundSet.forEach(e -> System.out.print(e + " "));

    }
}

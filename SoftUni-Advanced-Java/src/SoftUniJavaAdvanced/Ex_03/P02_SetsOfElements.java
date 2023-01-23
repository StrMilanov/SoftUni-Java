package SoftUniJavaAdvanced.Ex_03;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        Set<Integer> n1Set = new LinkedHashSet<>();
        Set<Integer> n2Set = new LinkedHashSet<>();
        Set<Integer> finalSet = new LinkedHashSet<>();

        for (int i = 0; i < n1; i++) {
            int n = scanner.nextInt();
            n1Set.add(n);
        }

        for (int i = 0; i < n2; i++) {
            int n = scanner.nextInt();
            n2Set.add(n);
        }

        n1Set.retainAll(n2Set);

        // OUTPUT
        n1Set.forEach(e -> System.out.print(e + " "));

    }
}

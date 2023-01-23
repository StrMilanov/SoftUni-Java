package SoftUniJavaAdvanced.Ex_03;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> usernamesSet = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            usernamesSet.add(name);
        }

        for (String key : usernamesSet) {
            System.out.println(key);
        }

    }
}

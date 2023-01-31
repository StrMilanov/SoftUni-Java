package SoftUniJavaAdvanced.Ex_05;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class P06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] namesList = scanner.nextLine().split("\\s+");

        Predicate<String> checkValidLength = name -> name.length() <= n;

        Arrays.stream(namesList)
                .filter(checkValidLength)
                .forEach(System.out::println);

    }
}

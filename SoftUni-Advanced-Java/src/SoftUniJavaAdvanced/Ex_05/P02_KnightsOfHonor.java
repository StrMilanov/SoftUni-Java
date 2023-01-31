package SoftUniJavaAdvanced.Ex_05;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class P02_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namesArray = scanner.nextLine().split("\\s+");

        Consumer<String> printSirName = name -> System.out.println("Sir " + name);

        Arrays.stream(namesArray).forEach(printSirName);
    }
}

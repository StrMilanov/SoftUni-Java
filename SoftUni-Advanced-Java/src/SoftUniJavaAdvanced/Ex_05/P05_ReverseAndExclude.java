package SoftUniJavaAdvanced.Ex_05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        // reverse
        Collections.reverse(numList);

        Predicate<Integer> checkDivision = num -> num % n == 0;
        numList.removeIf(checkDivision);

        numList.forEach(num -> System.out.print(num + " "));

    }
}

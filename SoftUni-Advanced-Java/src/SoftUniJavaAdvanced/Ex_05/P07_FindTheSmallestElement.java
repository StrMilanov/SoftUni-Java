package SoftUniJavaAdvanced.Ex_05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P07_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

//        // v1
//        Consumer<List<Integer>> printIndexOfMinElement = list -> {
//            int minElement = Collections.min(list);
//            System.out.println(list.lastIndexOf(minElement));
//        };
//        printIndexOfMinElement.accept(numList);

        // v2
        Function<List<Integer>, Integer> getLastIndexOfMinElement = list -> list.lastIndexOf(Collections.min(list));
        System.out.println(getLastIndexOfMinElement.apply(numList));

    }
}

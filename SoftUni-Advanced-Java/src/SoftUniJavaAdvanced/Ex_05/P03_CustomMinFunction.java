package SoftUniJavaAdvanced.Ex_05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


//        // v1
//        System.out.println(Collections.min(numList));

//        // v2
//        Consumer<List<Integer>> printMinNum = list -> System.out.println(Collections.min(list));
//        printMinNum.accept(numList);

        // v3
        Function<List<Integer>, Integer> getMinNum = list -> Collections.min(list);
        System.out.println(getMinNum.apply(numList));

    }
}

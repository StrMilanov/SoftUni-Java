package SoftUniJavaAdvanced.Ex_05;

import java.util.*;
import java.util.stream.Collectors;

public class P08_CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (Integer number : inputNumList) {
            if (number % 2 == 0) {
                evenList.add(number);
            } else {
                oddList.add(number);
            }
        }

        evenList.sort(Comparator.naturalOrder());
        oddList.sort(Comparator.naturalOrder());

        evenList.forEach(number -> System.out.print(number + " "));
        oddList.forEach(number -> System.out.print(number + " "));

    }
}

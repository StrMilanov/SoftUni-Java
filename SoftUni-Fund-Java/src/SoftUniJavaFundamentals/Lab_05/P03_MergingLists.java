package SoftUniJavaFundamentals.Lab_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numList2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> finalList = new ArrayList<>();

        for (int i = 0; i < Math.max(numList1.size(), numList2.size()); i++) {
            if (i < numList1.size()) {
                finalList.add(numList1.get(i));
            }
            if (i < numList2.size()) {
                finalList.add(numList2.get(i));
            }
        }

        for (int element : finalList) {
            System.out.print(element + " ");
        }

    }
}

package SoftUniJavaFundamentals.Lab_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < numList.size() - 1; i++) {
            numList.set(i, numList.get(i) + numList.get(numList.size() - 1));
            numList.remove(numList.size() - 1);
        }

        for (int element : numList) {
            System.out.print(element + " ");
        }
    }
}

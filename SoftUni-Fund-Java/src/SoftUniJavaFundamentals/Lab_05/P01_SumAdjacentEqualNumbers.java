package SoftUniJavaFundamentals.Lab_05;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numList.size() - 1; i++) {
            if (numList.get(i).equals(numList.get(i + 1))) {
                numList.set(i, numList.get(i) + numList.get(i + 1));
                numList.remove(i + 1);
                i = -1;
            }
        }

        for (Double element : numList) {
//            DecimalFormat format = new DecimalFormat("0.#");
//            String formattedElement = format.format(element);
            String formattedElement = new DecimalFormat("0.#").format(element);
            System.out.print(formattedElement + " ");
        }

    }
}

package SoftUniJavaFundamentals.Ex_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] operators = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bomb = operators[0];
        int power = operators[1];

        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) == bomb) {

                for (int j = 1; j <= power; j++) {
                    if (i + j > numList.size()-1) {
                        break;
                    } else {
                        numList.set(i + j, 0);
                    }
                }

                for (int j = 1; j <= power; j++) {
                    if (i - j < 0) {
                        break;
                    } else {
                        numList.set(i - j, 0);
                    }

                }

                numList.set(i, 0);
            }
        }

        int sum = 0;
        for (int element : numList) {
            sum += element;
        }
        System.out.println(sum);
    }
}

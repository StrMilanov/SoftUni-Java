package SoftUniJavaFundamentals.Ex_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> hand1List = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> hand2List = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (!hand1List.isEmpty() && !hand2List.isEmpty()) {
            if (!isSameHands(hand1List.get(0), hand2List.get(0))) {
                if (isHand1Bigger(hand1List.get(0), hand2List.get(0))) {
                    hand1List.add(hand1List.get(0));
                    hand1List.add(hand2List.get(0));
                } else {
                    hand2List.add(hand2List.get(0));
                    hand2List.add(hand1List.get(0));
                }
            }
            hand1List.remove(0);
            hand2List.remove(0);

        }

        if (hand2List.isEmpty()) {
            int sum = 0;
            for (int e : hand1List) {
                sum += e;
            }
            System.out.println("First player wins! Sum: " + sum);
        } else {
            int sum = 0;
            for (int e : hand2List) {
                sum += e;
            }
            System.out.println("Second player wins! Sum: " + sum);
        }


    }

    public static boolean isHand1Bigger(int a, int b) {
        return a > b;
    }

    public static boolean isSameHands(int a, int b) {
        return a == b;
    }

}

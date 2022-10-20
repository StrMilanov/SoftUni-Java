package SoftUniJavaFundamentals.Ex_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("End")) {
            switch (command[0]) {
                case "Add":
                    numList.add(Integer.parseInt(command[1]));
                    break;

                case "Insert":
                    if (isOutOfBounds(Integer.parseInt(command[2]), numList)) {
                        System.out.println("Invalid index");
                    } else {
                        numList.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    }
                    break;

                case "Remove":
                    if (isOutOfBounds(Integer.parseInt(command[1]), numList)) {
                        System.out.println("Invalid index");
                    } else {
                        numList.remove(Integer.parseInt(command[1]));
                    }
                    break;

                case "Shift":
                    if (command[1].equals("left")) {
                        int n = Integer.parseInt(command[2]);
                        for (int i = 1; i <= n; i++) {
                            numList.add(numList.get(0));
                            numList.remove(0);
                        }

                    } else if (command[1].equals("right")) {
                        int n = Integer.parseInt(command[2]);
                        for (int i = 1; i <= n; i++) {
                            int lastNum = numList.get(numList.size() - 1);
                            numList.add(0, lastNum);
                            numList.remove(numList.size() - 1);
                        }
                    }
                    break;
            }

            command = scanner.nextLine().split("\\s+");
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static boolean isOutOfBounds(int index, List<Integer> list) {
        return index > list.size() - 1 || index < 0;
    }

}

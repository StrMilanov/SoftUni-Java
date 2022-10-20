package SoftUniJavaFundamentals.Lab_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {
            switch (command[0]) {
                case "Contains":
                    if (numList.contains(Integer.valueOf(command[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print":
                    if (command[1].equals("even")) {
                        for (Integer element : numList) {
                            if (element % 2 == 0) {
                                System.out.print(element + " ");
                            }
                        }
                    } else {
                        for (Integer element : numList) {
                            if (element % 2 != 0) {
                                System.out.print(element + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;

                case "Get":
                    int sum = 0;
                    for (Integer element : numList) {
                        sum += element;
                    }
                    System.out.println(sum);
                    break;

                case "Filter":
                    String condition = command[1];
                    int number = Integer.parseInt(command[2]);

                    switch (condition) {
                        case "<":
                            for (Integer element : numList) {
                                if (element < number) {
                                    System.out.print(element + " ");
                                }
                            }
                            break;

                        case ">":
                            for (Integer element : numList) {
                                if (element > number) {
                                    System.out.print(element + " ");
                                }
                            }
                            break;

                        case ">=":
                            for (Integer element : numList) {
                                if (element >= number) {
                                    System.out.print(element + " ");
                                }
                            }
                            break;

                        case "<=":
                            for (Integer element : numList) {
                                if (element <= number) {
                                    System.out.print(element + " ");
                                }
                            }
                            break;
                    }
                    System.out.println();
                    break;
            }

            command = scanner.nextLine().split(" ");
        }

    }
}

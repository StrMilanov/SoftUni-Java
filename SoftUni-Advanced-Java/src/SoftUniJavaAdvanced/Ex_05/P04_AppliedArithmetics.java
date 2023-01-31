package SoftUniJavaAdvanced.Ex_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P04_AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> addCommand = list -> list.stream().map(num -> num += 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subtractCommand = list -> list.stream().map(num -> num -= 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiplyCommand = list -> list.stream().map(num -> num *= 2).collect(Collectors.toList());
        Consumer<List<Integer>> printCommand = list -> list.forEach(e -> System.out.print(e + " "));

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            switch (command) {
                case "add":
                    numList = addCommand.apply(numList);
                    break;

                case "multiply":
                    numList = multiplyCommand.apply(numList);
                    break;

                case "subtract":
                    numList = subtractCommand.apply(numList);
                    break;

                case "print":
                    printCommand.accept(numList);
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }

    }
}

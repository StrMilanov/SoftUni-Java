package SoftUniJavaFundamentals.Lab_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {
            switch (command[0]) {
                case "Add":
                    int numToAdd = Integer.parseInt(command[1]);
                    numList.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(command[1]);
                    numList.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(command[1]);
                    numList.remove(indexToRemove);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(command[1]);
                    int indexToInsertAt = Integer.parseInt(command[2]);
                    numList.add(indexToInsertAt, numToInsert);
                    break;
            }
            command = scanner.nextLine().split(" ");
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));

    }
}

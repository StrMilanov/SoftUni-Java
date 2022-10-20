package SoftUniJavaFundamentals.Ex_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {
            switch (command[0]) {
                case "Delete":
//                    List<Integer> toRemove = new ArrayList<>();
//                    toRemove.add(Integer.parseInt(command[1]));
                    numList.removeAll(List.of(Integer.parseInt(command[1])));
                    break;

                case "Insert":
                    int element = Integer.parseInt(command[1]);
                    int position = Integer.parseInt(command[2]);
                    numList.add(position, element);
                    break;
            }

            command = scanner.nextLine().split(" ");
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]",""));

    }
}

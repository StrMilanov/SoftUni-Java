package SoftUniJavaAdvanced.Ex_08.P07_CustomList;

import java.util.Scanner;

public class Main {
    private final static String SPLIT_REGEX = "\\s+";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();

        String input = scanner.nextLine();
        while (!input.equals("END")) {

            String command = input.split(SPLIT_REGEX)[0];
            switch (command) {

                case "Add":
                    String element = input.split(SPLIT_REGEX)[1];
                    customList.add(element);
                    break;

                case "Remove":
                    int indexToRemove = Integer.parseInt(input.split(SPLIT_REGEX)[1]);
                    customList.remove(indexToRemove);
                    break;

                case "Contains":
                    String elementToSearch = input.split(SPLIT_REGEX)[1];
                    System.out.println(customList.contains(elementToSearch));
                    break;

                case "Swap":
                    int indexOne = Integer.parseInt(input.split(SPLIT_REGEX)[1]);
                    int indexTwo = Integer.parseInt(input.split(SPLIT_REGEX)[2]);
                    customList.swap(indexOne, indexTwo);
                    break;

                case "Greater":
                    String elementToCompare = input.split(SPLIT_REGEX)[1];
                    System.out.println(customList.countGreaterThan(elementToCompare));
                    break;

                case "Max":
                    System.out.println(customList.getMax());
                    break;

                case "Min":
                    System.out.println(customList.getMin());
                    break;

                case "Print":
                    customList.printList();
                    break;

            }

            input = scanner.nextLine();
        }

    }
}

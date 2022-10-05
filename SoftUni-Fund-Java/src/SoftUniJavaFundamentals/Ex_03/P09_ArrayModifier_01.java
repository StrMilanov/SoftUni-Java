package SoftUniJavaFundamentals.Ex_03;

import java.util.Arrays;
import java.util.Scanner;

public class P09_ArrayModifier_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int tempValue1 = intArray[index1];
                intArray[index1] = intArray[index2];
                intArray[index2] = tempValue1;
            }

            if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                intArray[index1] *= intArray[index2];
            }

            if (command.contains("decrease")) {
                for (int i = 0; i <= intArray.length - 1; i++) {
                    intArray[i]--;
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i <= intArray.length - 1; i++) {
            if (i == intArray.length - 1) {
                System.out.println(intArray[i]);
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }

    }
}

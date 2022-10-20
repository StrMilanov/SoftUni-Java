package SoftUniJavaFundamentals.Ex_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("end")) {
            if (input[0].equals("Add")) {
                wagonsList.add(Integer.parseInt(input[1]));
            } else {
                int newPassengers = Integer.parseInt(input[0]);
                for (int i = 0; i < wagonsList.size(); i++) {
                    if (maxCapacity - wagonsList.get(i) >= newPassengers){
                        wagonsList.set(i, wagonsList.get(i) + newPassengers);
                        break;
                    }
                }
            }
            input = scanner.nextLine().split(" ");
        }

        System.out.println(wagonsList.toString().replaceAll("[\\[\\],]", ""));

    }
}

package SoftUniJavaAdvanced.Ex_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Function <приема, връща> -> apply
// Consumer <приема> -> accept (като void)
// Supplier <връща> -> get
// Predicate <приема> -> връща true/false -> test (като boolean)
// BiFunction <приема1, приема2, връща> -> apply

public class P10_PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> guestsList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(ArrayList::new));

        String input = scanner.nextLine();
        while (!input.equals("Party!")) {
            Predicate<String> predicate = null;

            String criteria = input.split("\\s+")[2];

            if (input.contains("Length")) {
                predicate = x -> x.length() == Integer.parseInt(criteria);
            } else if (input.contains("StartsWith")) {
                predicate = x -> x.startsWith(criteria);
            } else if (input.contains("EndsWith")){
                predicate = x -> x.endsWith(criteria);
            }

            if (input.contains("Remove")) {
                ArrayList<String> removedList = new ArrayList<>();
                for (String guest : guestsList) {
                    if (predicate.test(guest)) {
                        removedList.add(guest);
                    }
                }
                guestsList.removeAll(removedList);

            } else {
                ArrayList<String> toAdd = new ArrayList<>();
                for (String guest : guestsList) {
                    if (predicate.test(guest)) {
                        toAdd.add(guest);
                    }
                }
                guestsList.addAll(toAdd);
            }

            input = scanner.nextLine();
        }

        // OUTPUT
        if (guestsList.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println(guestsList.stream().sorted()
                    .collect(Collectors.toCollection(ArrayList::new))
                    .toString().replaceAll("([\\[\\]])", "") + " are going to the party!");
        }

    }
}

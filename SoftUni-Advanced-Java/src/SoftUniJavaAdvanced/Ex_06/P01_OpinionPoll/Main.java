package SoftUniJavaAdvanced.Ex_06.P01_OpinionPoll;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nPeople = Integer.parseInt(scanner.nextLine());
        List<Person> peopleList = new ArrayList<>();

        for (int i = 0; i < nPeople; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Person person = new Person(name, age);
            peopleList.add(person);
        }

        peopleList = peopleList.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());

        peopleList.sort(Comparator.comparing(person -> person.getName()));

        peopleList.forEach(person -> System.out.printf("%s - %d%n", person.getName(), person.getAge()));

    }
}

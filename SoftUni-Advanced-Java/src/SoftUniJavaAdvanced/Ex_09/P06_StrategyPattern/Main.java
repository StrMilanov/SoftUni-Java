package SoftUniJavaAdvanced.Ex_09.P06_StrategyPattern;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<Person> peopleName = new TreeSet<>(new NameComparator());
        TreeSet<Person> peopleAge = new TreeSet<>(new AgeComparator());

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String inputData = scanner.nextLine();
            peopleName.add(new Person(inputData));
            peopleAge.add(new Person(inputData));
        }

        peopleName.forEach(System.out::println);
        peopleAge.forEach(System.out::println);

    }
}

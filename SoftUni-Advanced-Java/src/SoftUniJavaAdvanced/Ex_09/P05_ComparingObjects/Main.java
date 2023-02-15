package SoftUniJavaAdvanced.Ex_09.P05_ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> peopleList = new ArrayList<>();
        int countPeople = 0;

        String input = scanner.nextLine();
        while (!input.equals("END")) {

            Person person = new Person(input);
            peopleList.add(person);
            countPeople++;

            input = scanner.nextLine();
        }


        int n = Integer.parseInt(scanner.nextLine());

        Person findPerson = peopleList.get(n - 1);
        peopleList.remove(n - 1);

        int count = 0;
        for (Person person : peopleList) {
            if (findPerson.compareTo(person) == 0) {
                count++;
            }
        }

        if (count != 0) {
            System.out.printf("%d %d %d", count + 1, countPeople - count - 1, countPeople);
        } else {
            System.out.println("No matches");
        }

    }
}

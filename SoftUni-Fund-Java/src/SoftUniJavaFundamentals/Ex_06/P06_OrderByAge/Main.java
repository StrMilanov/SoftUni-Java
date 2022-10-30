package SoftUniJavaFundamentals.Ex_06.P06_OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> peopleList = new ArrayList<>();

        String dataInput = scanner.nextLine();
        while (!dataInput.equals("End")) {
            String[] data = dataInput.split("\\s+");
            Person newPerson = new Person(data[0], data[1], Integer.parseInt(data[2]));
            peopleList.add(newPerson);

            dataInput = scanner.nextLine();
        }

        peopleList.sort(Comparator.comparing(Person::getAge));
        for (Person person : peopleList) {
            System.out.println(person);
        }

    }
}

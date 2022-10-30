package SoftUniJavaFundamentals.Ex_06.P03_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> peopleList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split("\\s+");
            peopleList.add(new Person(inputData[0], Integer.parseInt(inputData[1])));
        }

        for (Person person : peopleList) {
            if (person.getAge() > 30){
                System.out.println(person);
            }
        }

    }
}

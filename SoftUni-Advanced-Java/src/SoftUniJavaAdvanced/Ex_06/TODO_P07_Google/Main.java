package SoftUniJavaAdvanced.Ex_06.TODO_P07_Google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final String SPLIT_REGEX = "\\s+";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> peopleMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String name = input.split(SPLIT_REGEX)[0];

            if (peopleMap.isEmpty() || !peopleMap.containsKey(name)) {
                Person person = new Person(name);
                peopleMap.put(name, person);

            } else {
                switch (input.split(SPLIT_REGEX)[1]) {
                    case "company":
                        peopleMap.get(name).setCompanyName(input.split(SPLIT_REGEX)[2]);
                        peopleMap.get(name).setDepartment(input.split(SPLIT_REGEX)[3]);
                        peopleMap.get(name).setSalary(Double.parseDouble(input.split(SPLIT_REGEX)[3]));
                        break;

                    case "pokemon":
                        peopleMap.get(name).setPokemonName(input.split(SPLIT_REGEX)[2]);
                        peopleMap.get(name).setPokemonName(input.split(SPLIT_REGEX)[3]);
                        break;

                    case "parents":
                        peopleMap.get(name).setParentName(input.split(SPLIT_REGEX)[2]);
                        peopleMap.get(name).setParentBirthday(input.split(SPLIT_REGEX)[3]);
                        break;

                    case "children":
                        peopleMap.get(name).setChildName(input.split(SPLIT_REGEX)[2]);
                        peopleMap.get(name).setChildBirthday(input.split(SPLIT_REGEX)[3]);
                        break;

                    case "car":
                        peopleMap.get(name).setCarModel(input.split(SPLIT_REGEX)[2]);
                        peopleMap.get(name).setCarSpeed(input.split(SPLIT_REGEX)[3]);
                        break;
                }
            }

            input = scanner.nextLine();
        }


        // OUTPUT
        String name = scanner.nextLine();



    }

}

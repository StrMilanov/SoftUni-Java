package SoftUniJavaAdvanced.Ex_06.P07_Google;

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
            }

            switch (input.split(SPLIT_REGEX)[1]) {
                case "company":
                    peopleMap.get(name).setCompany(new Company());
                    peopleMap.get(name).getCompany().setCompanyName(input.split(SPLIT_REGEX)[2]);
                    peopleMap.get(name).getCompany().setDepartment(input.split(SPLIT_REGEX)[3]);
                    peopleMap.get(name).getCompany().setSalary(Double.parseDouble(input.split(SPLIT_REGEX)[4]));
                    break;

                case "pokemon":
                    String pokeName = input.split(SPLIT_REGEX)[2];
                    String pokeType = input.split(SPLIT_REGEX)[3];
                    peopleMap.get(name).getPokemonList().add(new Pokemon(pokeName, pokeType));
                    break;

                case "parents":
                    String parentName = input.split(SPLIT_REGEX)[2];
                    String parentBirthday = input.split(SPLIT_REGEX)[3];
                    peopleMap.get(name).getParentList().add(new Parent(parentName, parentBirthday));
                    break;

                case "children":
                    String childName = input.split(SPLIT_REGEX)[2];
                    String childBirthday = input.split(SPLIT_REGEX)[3];
                    peopleMap.get(name).getChildList().add(new Child(childName, childBirthday));
                    break;

                case "car":
                    peopleMap.get(name).setCar(new Car());
                    peopleMap.get(name).getCar().setCarModel(input.split(SPLIT_REGEX)[2]);
                    peopleMap.get(name).getCar().setCarSpeed(input.split(SPLIT_REGEX)[3]);
                    break;
            }
            input = scanner.nextLine();
        }


        // OUTPUT
        String name = scanner.nextLine();

        System.out.println(name);
        System.out.print(peopleMap.get(name).toString());

    }
}

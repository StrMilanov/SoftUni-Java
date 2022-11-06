package SoftUniJavaFundamentals.Ex_07;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> coursesMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String course = input.split(" : ")[0];
            String student = input.split(" : ")[1];

            coursesMap.putIfAbsent(course, new ArrayList<>());
            coursesMap.get(course).add(student);

            input = scanner.nextLine();
        }

        for (var course : coursesMap.entrySet()) {
            System.out.printf("%s: %d\n", course.getKey(), course.getValue().size());

            for (String name : coursesMap.get(course.getKey())) {
                System.out.println("-- " + name);
            }
        }

    }
}

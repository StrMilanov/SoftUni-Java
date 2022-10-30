package SoftUniJavaFundamentals.Lab_06.P05_Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] currentStudent = input.split("\\s+");

            Student newStudent = new Student(currentStudent[0], currentStudent[1], Integer.parseInt(currentStudent[2]), currentStudent[3]);
            studentList.add(newStudent);

            input = scanner.nextLine();
        }

        String requiredTown = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getHometown().equals(requiredTown)){
                System.out.println(student.toString());
            }
        }

    }
}

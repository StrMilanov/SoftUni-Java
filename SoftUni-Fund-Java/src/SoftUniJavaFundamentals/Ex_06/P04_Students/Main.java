package SoftUniJavaFundamentals.Ex_06.P04_Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> studentsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split("\\s+");
            Student newStudent = new Student(inputData[0], inputData[1], Double.parseDouble(inputData[2]));
            studentsList.add(newStudent);
        }

//        studentsList.sort(Comparator.comparing(Student::getGrade).reversed());

        List<Double> gradesList = new ArrayList<>();
        for (int i = 0; i < studentsList.size(); i++) {
            gradesList.add(studentsList.get(i).getGrade());
        }

        gradesList.sort(Comparator.reverseOrder());

        for (Double grade : gradesList) {
            for (Student student : studentsList) {
                if (student.getGrade() == grade){
                    System.out.println(student);
                }
            }
        }

    }
}

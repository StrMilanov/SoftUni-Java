package SoftUniJavaFundamentals.Ex_07;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<Double>> studentsMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            Double studentGrade = Double.parseDouble(scanner.nextLine());

            studentsMap.putIfAbsent(studentName, new ArrayList<>());
            studentsMap.get(studentName).add(studentGrade);
        }

        for (var student : studentsMap.entrySet()) {
            double sumGrades = 0.0;
            for (int i = 0; i < student.getValue().size(); i++) {
                sumGrades += student.getValue().get(i);
            }
            double avgGrade = sumGrades / student.getValue().size();

            if (avgGrade >= 4.5) {
                System.out.printf("%s -> %.2f\n", student.getKey(), avgGrade);
            }
        }

    }
}

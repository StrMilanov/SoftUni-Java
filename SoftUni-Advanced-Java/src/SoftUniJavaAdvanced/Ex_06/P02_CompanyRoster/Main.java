package SoftUniJavaAdvanced.Ex_06.P02_CompanyRoster;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();
        Map<String, Department> departmentMap = new HashMap<>();

        String highestAvgSalaryDepartment = "";

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String employeeDepartment = data[3];
            String email = "n/a";
            int age = -1;

            if (data.length == 6) {
                email = data[4];
                age = Integer.parseInt(data[5]);
            } else if (data.length == 5 && data[4].contains("@")) {
                email = data[4];
            } else if (data.length == 5) {
                age = Integer.parseInt(data[4]);
            }

            Employee employee = new Employee(name, salary, position, employeeDepartment, email, age);
            employeeList.add(employee);


            // Load Employees to Departments
            if (departmentMap.isEmpty() || !departmentMap.containsKey(employeeDepartment)) {
                Department department = new Department(employeeDepartment, employee);
                departmentMap.put(employeeDepartment, department);

            } else {
                departmentMap.get(employeeDepartment).getDepartmentEmployeesList().add(employee);
            }

        }


        // Get department with the highest average salary
        if (!departmentMap.isEmpty()) {
            double highestAvgSalary = Double.MIN_VALUE;

            for (Map.Entry<String, Department> department : departmentMap.entrySet()) {
                double currentAvgSalary = 0;
                double totalSalary = 0;

                for (Employee employee : department.getValue().getDepartmentEmployeesList()) {
                    totalSalary += employee.getSalary();
                }

                currentAvgSalary = totalSalary / department.getValue().getDepartmentEmployeesList().size();
                if (currentAvgSalary > highestAvgSalary) {
                    highestAvgSalary = currentAvgSalary;
                    highestAvgSalaryDepartment = department.getKey();
                }
            }

        }

        departmentMap.get(highestAvgSalaryDepartment).sortEmployeeListDescending();

        System.out.println("Highest Average Salary: " + highestAvgSalaryDepartment);
        for (Employee employee : departmentMap.get(highestAvgSalaryDepartment).getDepartmentEmployeesList()) {
            System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
        }


    }

}

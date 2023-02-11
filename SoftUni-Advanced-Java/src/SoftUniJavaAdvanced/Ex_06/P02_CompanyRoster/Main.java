package SoftUniJavaAdvanced.Ex_06.P02_CompanyRoster;

import SoftUniJavaAdvanced.Ex_06.P01_OpinionPoll.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();
        Map<String, Department> departmentMap = new HashMap<>();

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
            } else if (data.length == 5 && Character.isDigit(data[4].toCharArray()[0])) {
                // FIXME - email might start with digit
                age = Integer.parseInt(data[4]);
            } else if (data.length == 5) {
                email = data[4];
            }

            Employee employee = new Employee(name, salary, position, employeeDepartment, email, age);
            employeeList.add(employee);

//            Department department = null;
//            if (departmentMap.isEmpty()) {
//                department = new Department(employeeDepartment, employee);
//                departmentMap.put(employeeDepartment, department);
//
//            } else if (departmentMap.containsKey(employeeDepartment)) {
//                departmentMap.get(employeeDepartment).getEmployeeList().add(employee);
//
//            } else {
//                department = new Department(employeeDepartment, employee);
//                departmentMap.put(employeeDepartment, department);
//            }

            if (!departmentMap.containsKey(employeeDepartment)){
                departmentMap.put(employeeDepartment, new Department(employeeDepartment, employee));
            }


        }


        System.out.println();

    }
}

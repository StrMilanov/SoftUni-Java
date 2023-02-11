package SoftUniJavaAdvanced.Ex_06.P02_CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Department {

    private String departmentName;
    private Employee employee;
    private List<Employee> departmentEmployeesList;

    public Department(String departmentName, Employee employee) {
        this.departmentName = departmentName;
        this.employee = employee;
        this.departmentEmployeesList = new ArrayList<>();
        addEmployee(employee, departmentEmployeesList);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getDepartmentEmployeesList() {
        return departmentEmployeesList;
    }

    public void setDepartmentEmployeesList(List<Employee> departmentEmployeesList) {
        this.departmentEmployeesList = departmentEmployeesList;
    }

    private void addEmployee(Employee employee, List<Employee> list) {
        list.add(employee);
    }

    public void sortEmployeeListDescending() {
        departmentEmployeesList.sort(Comparator.comparing(Employee::getSalary).reversed());
    }

}

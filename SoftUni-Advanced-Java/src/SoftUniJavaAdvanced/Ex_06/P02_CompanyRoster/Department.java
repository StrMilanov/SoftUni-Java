package SoftUniJavaAdvanced.Ex_06.P02_CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String departmentName;
    private List<Employee> employeeList;

    public Department(String departmentName, Employee employeeList) {
        this.departmentName = departmentName;
        this.employeeList = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}

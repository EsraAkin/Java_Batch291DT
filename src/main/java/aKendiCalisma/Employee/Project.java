package aKendiCalisma.Employee;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private List<Employee> employees;

    public Project(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showProjectEmployees() {
        System.out.println(name + " projesindeki çalışanlar:");
        for (Employee employee : employees) {
            System.out.println("- " + employee.name);
        }
    }
}

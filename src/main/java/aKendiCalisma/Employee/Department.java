package aKendiCalisma.Employee;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees=new ArrayList<>();
    }


    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void showEmployees() {
        System.out.println(name + " departmanındaki çalışanlar:");
        for (Employee employee : employees) {
            System.out.println("- " + employee.name + ", Maaş: " + employee.calculateSalary());
        }
    }


}

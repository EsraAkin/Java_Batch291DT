package aKendiCalisma.Employee;

public class Employee {
protected String name;
protected double salary;
protected String department;


public Employee(String name,double salary, String depertment){
    this.name=name;
    this.salary=salary;
    this.department=department;

}

    public void work() {
        System.out.println(name +" çalışıyor");
    }

    public double calculateSalary() {
        return salary;
    }
}

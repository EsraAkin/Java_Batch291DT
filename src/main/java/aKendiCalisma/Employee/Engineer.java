package aKendiCalisma.Employee;

public class Engineer extends Employee {
    public Engineer(String name, double salary, String department) {
        super(name, salary, department);
    }

    @Override
    public void work() {
        System.out.println(name + " projede çalışıyor.");
    }

    @Override
    public double calculateSalary() {
        return salary + 1000; // Mühendisler prim alıyor
    }
}
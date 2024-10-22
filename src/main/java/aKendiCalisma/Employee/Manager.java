package aKendiCalisma.Employee;

public class Manager extends Employee {
    public Manager(String name, double salary, String department) {
        super(name, salary, department);
    }

    @Override
    public void work() {
        System.out.println(name+ " projeyi denetliyor");
    }

    @Override
    public double calculateSalary() {
        return salary+2000;  // Yöneticilere ek sorumluluk maaşı
    }
}

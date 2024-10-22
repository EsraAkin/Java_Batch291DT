package aKendiCalisma.Employee;

public class Inturn extends Employee{
    public Inturn (String name, String department){
        super(name, 1000, department);
    }

    @Override
    public void work() {
        System.out.println(name+ " stajyer olarak basit görevleri yapıyor.");
    }

    @Override
    public double calculateSalary() {
        return salary; // Stajyer sabit maaş alıyor
    }
}

package aKendiCalisma.comp;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void getRole() {
        System.out.println("Çalışanın rolü: Genel çalışan");
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary); // Parent (Employee) constructor'ı çağırıyor
    }

    @Override
    public void getRole() {
        System.out.println("Çalışanın rolü: Yönetici");
    }
}

public class Company {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ahmet", 5000);
        Manager m1 = new Manager("Ayşe", 10000);

        System.out.println(e1.name+e1.salary);


        e1.getRole();  // Çıktı: Çalışanın rolü: Genel çalışan
        m1.getRole();  // Çıktı: Çalışanın rolü: Yönetici
    }
}


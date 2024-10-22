package aKendiCalisma.Employee;

public class Main {
    public static void main(String[] args) {
        // Departman oluştur
        Department softwareDept = new Department("Yazılım");

        // Çalışanlar oluştur
        Engineer engineer = new Engineer("Ahmet", 5000, "Yazılım");
        Manager manager = new Manager("Ayşe", 7000, "Yazılım");
        Inturn intern = new Inturn("Mehmet", "Yazılım");

        // Çalışanları departmana ekle
        softwareDept.addEmployee(engineer);
        softwareDept.addEmployee(manager);
        softwareDept.addEmployee(intern);

        // Departman çalışanlarını göster
        softwareDept.showEmployees();

        // Proje oluştur
        Project crmProject = new Project("CRM Geliştirme");

        // Projeye çalışanları ekle
        crmProject.addEmployee(engineer);
        crmProject.addEmployee(intern);

        // Projede çalışanları göster
        crmProject.showProjectEmployees();
    }
}

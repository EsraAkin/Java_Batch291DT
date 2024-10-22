package aKendiCalisma.comp;

class Parent {
    public void greet() {
        System.out.println("Hello from Parent!");
    }
}

class Child extends Parent {
    @Override
    public void greet() {
        super.greet();  // Parent sınıfın greet() metodunu çağırıyoruz
        System.out.println("Hello from Child!");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.greet();
        // Çıktı:
        // Hello from Parent!
        // Hello from Child!
    }
}

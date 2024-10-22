package aKendiCalisma;

class MotorluArac {
    public void hizOlc() {
        System.out.println("Motorlu araç hızı ölçülüyor...");
    }
}

class Araba extends MotorluArac {
    @Override
    public void hizOlc() {
        System.out.println("Araba hızı ölçülüyor...");
    }
}

class Motorsiklet extends MotorluArac {
    @Override
    public void hizOlc() {
        System.out.println("Motorsiklet hızı ölçülüyor...");
    }
}

public class OOP {
    public static void main(String[] args) {
        MotorluArac arac = new Araba();  // Upcasting
        arac.hizOlc();  // Çalışma zamanında Araba sınıfının metodu çağrılır

        MotorluArac motosiklet = new Motorsiklet();  // Upcasting
        motosiklet.hizOlc();  // Çalışma zamanında Motorsiklet sınıfının metodu çağrılır
    }
}

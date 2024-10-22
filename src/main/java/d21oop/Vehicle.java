package d21oop;

public class Vehicle {

    /*Constructor Hiyerarsisi- Child class'tan bir object olusturdugunuzda constructor'lar
    en ustteki parent class'tan baslatilarak alta doğru calistirilir*/ //***yani child clastan bir obje oluştururken constructurlar
    //önce dede sonra baba sırasıyla çalışır.

    //Constructor olusturalim

    public Vehicle() {
        this("Honda", 2024, "Elektrikli");
        System.out.println("Honda, 2023, Benzin");
    }

    public Vehicle(String marka, int year, String model) { //4
        super();
        System.out.println("Honda, 2024, Elektrikli");
    }
}

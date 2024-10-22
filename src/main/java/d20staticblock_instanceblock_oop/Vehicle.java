package d20staticblock_instanceblock_oop;

public class Vehicle {

    /*Constructor Hiyerarsisi- Child class'tan bir object olusturdugunuzda constructor'lar
    en ustteki parent class'tan baslatilarak alta doğru calistirilir*/ //***yani child clastan bir obje oluştururken constructurlar
    //önce dede sonra baba sırasıyla çalışır.

    //Constructor olusturalim

    public Vehicle(){
        System.out.println("Honda, 2023, Benzin");
    }


}

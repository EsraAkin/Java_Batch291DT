package d23oop_collections;

public class AudiRunner {
    public static void main(String[] args) {
        //Engine e=new Engine(); //HATA, interfacelerden obje üretilemez.
        AudiA4 a4 = new AudiA4();
        a4.turbo(); //Audi A4 turbo motor kullanır.
        a4.esp();   //Audi A4 esp fren sistemi kullanır.
        a4.digital();//Audi A4 digital klima kullanır.
        a4.run(); //Audi A4 hava yastığı çalıştırır.
        System.out.println(Engine.price);  //2000
        System.out.println(Engine.fiyat);  //300
        System.out.println(AC.fiyat);      //100

        Engine.speed(); //Saatte 300 km
        a4.power(); //200 HP  //power static methodda olmadığı için nesne üzerinden ulaştım.
    }
}

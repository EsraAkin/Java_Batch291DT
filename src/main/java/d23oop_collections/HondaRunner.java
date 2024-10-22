package d23oop_collections;

public class HondaRunner {
    public static void main(String[] args) {
        //  Honda h=new Honda() //***Abstract classlardan obje üretilemez. Çünkü sınıflandırma için üretildi.
        Civic c = new Civic();
        c.engine(); //Gas 1.6 Eco

        Accord a = new Accord();
        c.engine(); //Gas 1.6 Eco

        a.music();  //Pro

    }
}

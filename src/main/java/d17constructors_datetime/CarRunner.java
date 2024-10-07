package d17constructors_datetime;

import java.util.Arrays;

public class CarRunner {
    public static void main(String[] args) {

        //4- Car class’indan bir object uretelim

        //9- Default Car() icine parametre girelim

        Car c1 = new Car("BMW", "3.20", 2024, false);  //Artık BMW üretiyor. Aynı klass farklı ürün.
        System.out.println(c1.brand);  //Honda //BMW
        System.out.println(c1.model);  //Accord //3.20
        System.out.println(c1.year);   //2023 //2024
        System.out.println(c1.hybrid); //true  //false

        c1.action(); //Honda  hızlı hareket eder
        c1.stop();   //Honda güvenli bir şekilde durur.

        //5- Car class’a donup, constructor olusturalim


        //10- Baska bir object uretelim ve direkt objeyi yazdiralim
        Car c2 = new Car("Audi", "A4", 2018, false);
        System.out.println(c1);  //d17constructors_datetime.Car@2d98a335 // yani reference gösterir
        System.out.println(c2);  //d17constructors_datetime.Car@16b98e56

        //11- Reference durumunu duzeltmek icin Car class’a tostring methodu ekleyelim. Böylece veriyi toplu görebilirim.
        //Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.

        //16- Yeni bir object uretelim
        Car c3=new Car("Tofaş", "Şahin");
        System.out.println(c3);

        Car c4=new Car("Mercedes", "ggg", 1985, true);
        System.out.println("c4"+c4);


    }

}

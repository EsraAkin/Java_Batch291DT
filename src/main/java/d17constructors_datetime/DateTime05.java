package d17constructors_datetime;

import java.time.LocalDate;
import java.time.Period;

public class DateTime05 {
    public static void main(String[] args) {
        //ornek 2: Verilen iki tarih arasindaki farki hesaplayan kodu yaziniz.
        //example 2: Write the code that calculates the difference between two given dates.

        //Java'da Period class'i, tarihler arasındaki yıl, ay ve gün farklarını temsil etmek için kullanılır.
        // Bu sınıf, iki LocalDate nesnesi arasındaki zaman farkını ifade eder ve java.time paketi içinde yer alır.
        // Period sınıfı, tarihler arasındaki farkları kolayca yönetmek ve manipüle etmek için çeşitli metodlar sağlar.

        //Kullanım Alanları
        //Period sınıfı, özellikle tarihler arasındaki uzun süreli farkları hesaplamak, tarihleri manipüle etmek
        // veya tarihler arası geçiş sürelerini yönetmek için kullanışlıdır. Finans, sağlık, eğitim gibi alanlarda
        // ve tarih ile ilgili işlemlerin sık yapıldığı her türlü yazılım geliştirme projelerinde etkili bir araçtır.

        //Period.between() metodu, iki tarih arasındaki farkı hesaplamak için kullanılır.
        // Bu metod, başlangıç ve bitiş tarihleri arasındaki tam yıl, ay ve gün farkını bir Period nesnesi olarak döndürür.


        LocalDate date1 = LocalDate.of(2024, 5, 28);
        LocalDate date2 = LocalDate.of(2011, 3, 28);

        Period difference = Period.between(date2, date1);
        System.out.println(difference);

        //Ayrı ayrı görelim
        int yearDiffrerence = difference.getYears();
        int monthDifference = difference.getMonths();
        int dayDifference = difference.getDays();

        System.out.println(date1 + " ve " + date2 + " arasindaki fark:"); //2024-05-28 ve 2022-12-24 arasindaki fark:
        System.out.println("Yil : " + yearDiffrerence); //Yil : 1
        System.out.println("Ay: " + monthDifference); //Ay: 5
        System.out.println("Gun : " + dayDifference); //Gun : 4

        LocalDate date3 = (LocalDate.now());
        System.out.println(Period.between(date3, date2));

//Instant
        //ZonedDateTime
        //Duration
        //Clock

        //https://www.oracle.com/technical-resources/articles/java/jf14-date-time.html


    }
}

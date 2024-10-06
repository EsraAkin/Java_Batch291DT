package d17constructors_datetime;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTime03 {
    public static void main(String[] args) {


        //Gün 30 mu 31 mi onu nasıl kontrol edecek Hocam. Veritabanında olmalı tüm dateler
        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.

        //Example 1: If the date you have received from the user is in the past, give the message “You have entered an invalid date”.
        //If the date you have received from the user is in the future, say “You can enter the time”.


        Scanner input = new Scanner(System.in);

        LocalDate givenDate = null;    //LocalDate givenDate; de yazabilirdik.   şu anda boş kullanıcıya girdirecem.
        while (true) {

            System.out.println("Lutfen yili giriniz");
            int year = input.nextInt();
            System.out.println("Lutfen ayi giriniz");
            int month = input.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Ay 1 ile 12 arasında olmalıdır. Tekrar deneyiniz. ");
                continue;    //Kullanıcıyı döngünün başına yönlendirir.
            }
            System.out.println("Lütfen günü giriniz: ");
            int day = input.nextInt();

            //Ayın kaç çektiğini bulalım. Yıl ve ay için YearMonth objesi oluşturalım. yılı vermezsem ayı bilemez
            YearMonth yearMonth = YearMonth.of(year, month);

            //Ayın maksimum gün sayısını bulalım.
            int daysInMonth = yearMonth.lengthOfMonth();   //lengthOfMonth() hazır bir metot bu

            if (day < 1 || day > daysInMonth) {
                System.out.println("Girilen ay icin gecersiz gun. Tekrar deneyiniz");
                continue;
            }

            givenDate = LocalDate.of(year, month, day); //Girilen bilgilerle tarih olusturduk

            if (givenDate.isBefore(LocalDate.now())) {
                System.out.println("Gecersiz, gecmis bir tarih girdiniz. Tekrar deneyiniz");
            } else {
                System.out.println("Zamani girebilirsiniz");
                break; //Gecerli tarih girildigi icin donguyu kirdik
            }


        }
        //break'te buradaki kodlar calisir
        //return icinde bulundugu metodu sonlandirir. Burada main metodu sonlandirir ve
        //programin calismasi durur

    }
}

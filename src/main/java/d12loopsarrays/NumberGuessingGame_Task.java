package d12loopsarrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame_Task {
    public static void main(String[] args) {
        //ODEV: 20(dahil) ile 100(dahil) arasında random sayi isteseydik?

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();       //Java random sayı uretir.

        //20-100 arasinda rastgele sayı üretelim.
        int rastgeleSayi = 20 + random.nextInt(81); //20-100 arası sayı uretir.
        System.out.println(rastgeleSayi);

        //Kullanıcının kaç kere tahmin yaptığınıtakip etmek için bir sayac oluşturalım.
        int denemeSayisi=0;

        //Kullanıcının yaptığı tahmini saklamak için bir değişken oluşturalım.
        int tahminEdilen; // int tahminEdilen=""; çalışır mıydı?

        //Kullanıcının sayıyı doğru tahmin edip edilmediğini kontrol etmek için bir boolen değişken oluşturalım.
        boolean tahminDogrumu=false;

        System.out.println("20-100 arasında bir sayı tahmin etmeye çalışın.");

        do {

            //Kullanıcıdan bir tahmin alalım
            System.out.println("Tahmininizi yapınız.");
            tahminEdilen=scanner.nextInt();

            //Sayacı 1 arttıralım
            denemeSayisi++;

            //Tahmini kontrol edelim
            if (tahminEdilen<rastgeleSayi){

                System.out.println("Sayı daha büyük");
            }else if(tahminEdilen>rastgeleSayi){
                System.out.println("Sayı daha küçük");
            }else {
                tahminDogrumu=true;
                System.out.println("Tebrikler doğru tahmin!");
                System.out.println("Deneme sayısı: "+denemeSayisi);
            }

        }while(!tahminDogrumu);  //Döngü doğru tahmin yapılıncaya kadar devam edecek.
        scanner.close();




    }
}

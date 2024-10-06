package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysOdev {
    public static void main(String[] args) {


        /* 6.Soru -Verilen String bir array'de en uzun
        ve en kisa String'leri yazdıran bir method olusturun
                */

        String[] str1 = {"Learn", "Java", "earn", "money.", "True", "or", "false", "?"};
        String uzun = str1[0];
        String kisa = str1[0];

        for (String w : str1) {
            if (w.length() > uzun.length()) {
                uzun = w;
            }
        }
        for (String w : str1) {
            if (w.length() < kisa.length()) {
                kisa = w;
            }
        }
        System.out.println("uzun kelime= " + uzun);  //money.
        System.out.println("kisa kelime= " + kisa);  //?



        /* 7.soru -Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
         true veya false sonucu donen bir method olusturun*/

        String[] str2 = {"Learn", "Java", "earn", "money.", "True", "or", "false", "?"};
        boolean kelimeVarMi = false;
        String arananEleman = "money.";
        for (String w : str2) {
            if (w.equals(arananEleman)) {
                kelimeVarMi = true;
                break;
            }
        }
        if (kelimeVarMi == true) {
            System.out.println("Aradığınız kelime metinde var.");
        } else
            System.out.println("Aradığınız kelime yok");



        /*ÖDEV
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
        */
        int[] randomSayilar = new int[200];
        Random random = new Random();

        for (int i = 0; i < randomSayilar.length; i++) {
            int yeniSayi = random.nextInt(1000);
            boolean tekrarVarMi;

            // Random sayılar arasında aynı sayı üretilmiş mi kontrol et.
            do {
                tekrarVarMi = false;
                for (int w : randomSayilar) {
                    if (w == yeniSayi) { // Eğer sayı tekrar ediyorsa
                        tekrarVarMi = true;
                        yeniSayi = random.nextInt(1000); // Yeni bir sayı üret
                        break;
                    }
                }
            } while (tekrarVarMi); // Tekrar eden sayı bulunduysa tekrar yeni sayı üret

            randomSayilar[i] = yeniSayi; // Benzersiz sayıyı diziye ekle
        }


        System.out.println(Arrays.toString(randomSayilar)); // 200 adet üretilen sayılar

        // -----Kullanıcıdan sayı tahmini alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.println("0-1000 arası Bir sayı tahmin ediniz: ");
        int tahminEdilen = input.nextInt();

        // Sayı dizide var mı kontrol ediyoruz
        boolean sayiVarMi1 = false;

        for (int w : randomSayilar) {
            if (w == tahminEdilen) {
                sayiVarMi1 = true;
                break;
            }
        }

        if (sayiVarMi1) {
            System.out.println("Doğru tahmin.");
        } else {
            System.out.println("Yanlış tahmin.");
        }


        /*
        Asagidaki multi dimensional array'in
        ic array'lerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir array'in elemani yapan
        ve yeni array'i ekrana yazdiran bir program yaziniz*/
        int[][] sayilar = {{1, 2, 3}, {4, 5}, {6, 7}}; //==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
        int[] bosToplam = new int[sayilar.length];

        int index = 0;
        for (int[] w : sayilar) {  //1,2,3
            int toplam = 0;
            for (int k : w) {
                toplam = k + toplam;
            }
            bosToplam[index] = toplam;
            index++;
        }
        System.out.println(Arrays.toString(bosToplam));  //6, 9 ,13
    }
}

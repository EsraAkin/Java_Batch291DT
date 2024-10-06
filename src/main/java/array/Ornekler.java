package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ornekler {
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
        System.out.println("en uzun kelime: " + uzun);
        System.out.println("en kisa kelime: " + kisa);




/* 7.soru -Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
 true veya false sonucu donen bir method olusturun*/

        //String[] str1 = {"Learn", "Java", "earn", "money.", "True", "or", "false", "?"}; mesela

        Scanner input = new Scanner(System.in);
        System.out.println("Hangi kelimeyi arıyorsunuz?");
        String arananKelime = input.next();

        boolean kelimeVarMi = false;
        for (String w : str1) {
            if (w.equals(arananKelime)) {
                kelimeVarMi = true;
                break;
            }
        }

        if (kelimeVarMi == true) {
            System.out.println(arananKelime + " kelimesi var.");
        } else System.out.println(arananKelime + " kelimesi maalesef yok.");


/*ÖDEV
icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
kullanicidan bir sayi isteyip
listede var olup olmadigini kullaniciya yazin
*/
        int[] randomSayilar = new int[200];
        Random random = new Random();
        for (int i = 0; i < randomSayilar.length; i++) {
            randomSayilar[i] = random.nextInt(1000);  // 0 ile 999 arasında rastgele sayı atıyoruz
        }
        System.out.println(Arrays.toString(randomSayilar));
        System.out.println(randomSayilar.length); //200


        System.out.println("1-1000 arası Sayı tahmin ediniz.");
        int sayiTahmin = input.nextInt();
        boolean tahminVarMi = false;
        for (int w : randomSayilar) {
            if (w == sayiTahmin) {
                tahminVarMi = true;
                break;
            }
        }
        if (tahminVarMi) {
            System.out.println("Tahmin ettiğin sayı dizide mevcut.");
        } else {
            System.out.println("Tahmin ettiğin sayı dizide mevcut değil.");
        }


/*
Asagidaki multi dimensional array'in
ic array'lerindeki tum elemanlarin toplamini birer birer bulan
ve herbir sonucu yeni bir array'in elemani yapan
ve yeni array'i ekrana yazdiran bir program yaziniz
Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
*/

        int[][] sayilar = {{1, 2, 3}, {4, 5}, {6, 7}};
        int[] bosArray = new int[sayilar.length];
        int index = 0;


        for (int[] w : sayilar) {
            int sum = 0;
            for (int k : w) {
                sum = k + sum;
            }
            bosArray[index] = sum;
            index++;
        }
        System.out.println(Arrays.toString(bosArray));
    }
}

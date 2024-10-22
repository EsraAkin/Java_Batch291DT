package aKendiCalisma;

import java.util.Arrays;

public class TekArrays {
    public static void main(String[] args) {

        //ARRAY
        //Bir array (dizi), aynı türde birden fazla değeri saklamak için kullanılan bir veri yapısıdır.
        //İçinde birden fazla aynı türden (örneğin int, char, String vb.) eleman barındırır.
        //Bir array'in boyutu oluşturulduktan sonra sabittir, değiştirilemez.

        //Array'in Amaçları ve Kullanım Alanları
        //Birden fazla veriyi saklama: Bir array, birden fazla aynı türden veriyi tek bir değişkenle saklamamızı sağlar.
        //Örneğin, 100 öğrencinin notlarını tutmak için ayrı ayrı 100 değişken yerine bir array kullanılabilir.
        //Sıralı ve hızlı erişim: Diziler bellekte ardışık olarak saklandığından, bir elemanı dizi içinde bulmak oldukça
        // hızlıdır. Array'in indeksine göre doğrudan erişilebilir.
        //Verilerin düzenlenmesi: Aynı türdeki veriler bir dizide tutulduğu için üzerinde kolayca sıralama, arama gibi işlemler yapılabilir.

        //Array'in Tanımlanması ve Kullanımı
        int[] sayilar = new int[5];  // 5 elemanlı bir int dizisi

        sayilar[0] = 10;
        sayilar[1] = 20;
        sayilar[2] = 30;
        sayilar[3] = 40;
        sayilar[4] = 50;

        System.out.println(Arrays.toString(sayilar));
        System.out.println(sayilar[3]); //40
        System.out.println(sayilar.length);//5

        //Array'in Elemanlarına Erişim
        System.out.println(sayilar[0]);
        int birinciEleman = sayilar[0];  // 10
        int ikinciEleman = sayilar[1];   // 20

        // Array'in Boyutu
        int sayilaruzunluk = sayilar.length; // 5

        //Array'in * Noktaları
        //Sabit Boyut
        //Başlangıç Değerleri:  int[] array'i için başlangıç değeri 0'dır.
        //boolean[] array'i için başlangıç değeri false'dur.
        //String[] array'i için başlangıç değeri null'dır.


        int[] sayilar2 = {2, 3, 4, 5, 6, 6, 7, 8};  //Array'ı direk böyle de oluşturabilirim.
        System.out.println(Arrays.toString(sayilar2)); //[2, 3, 4, 5, 6, 6, 7, 8]

        //Örnek 1:  int[]sayilar2={2,3,4,5,6,6,7,8}; dizideki 5'ten küçükleri yazdır.

      /*  for (int i = 0; i <sayilar2.length ; i++) {
            if(sayilar2[i]<5){
                System.out.print(sayilar2[i]+ ", ");
            }

        }*/

        for (int w : sayilar2) {
            if (w < 5) {
                System.out.print(w + ", ");
            }

        }

        //Bir elemanın dizide olup olmadığını anlamak için; önce sort() ile sırala, sonra BinarySerch kullan.
        String[] openPositions = {"MANAGER", "HR SPECIALIST", "SYSTEM ENGINEER", "SOFTWARE ENGINEER", "EXPERT", "ASSISTANT MANAGER"};
        Arrays.sort(openPositions);
        System.out.println(Arrays.toString(openPositions));
        //[ASSISTANT MANAGER, EXPERT, HR SPECIALIST, MANAGER, SOFTWARE ENGINEER, SYSTEM ENGINEER]
        int result = Arrays.binarySearch(openPositions, "SOFTWARE ENGINEER");
        System.out.println(result);  //4. index //var 4. indexte

        int result2 = Arrays.binarySearch(openPositions, "aaa");
        System.out.println(result2);  //-7 yani yok


        //Bir cümlede kaç kelime var? Stringi diziye atabilir miyim?
        String s1 = "Java is easy. Learn Java earn money.";
        String[] words = s1.split(" ");
        System.out.println(Arrays.toString(words)); //[Java, is, easy., Learn, Java, earn, money.]   ******
        System.out.println(words.length);//7

        String a = words[0];
        System.out.println(a); //Java
        System.out.println(words[0]); //Java
        System.out.println(words[1]); //is


        //Peki  a harfi var mı?
        for (String w : words) {
            if (w.contains("a")) {
                System.out.print(w + " "); //Java easy. Learn Java earn
            }
        }




    }
}

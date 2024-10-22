package aKendiCalisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskArray2BetulH {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String> asiz = new ArrayList<>();
        String[] list1 = {"Ali", "Veli", "Ayse", "Fatma", "Omer"};
        for (int i = list1.length - 1; i > 0; i--) {
            if (!list1[i].toLowerCase().contains("a")) {
                asiz.add(list1[i]);
            }
        }
        System.out.println(asiz);




/* TASK :
ayna check sorusu:
 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
 output : verilen array simetriktir
 */
        int[] arr1 = {0, 1, 2, 3, 4, 4, 3, 2, 1, 0};
        List<Integer> lista = new ArrayList<>();
        List<Integer> listb = new ArrayList<>();

        int listLength = arr1.length / 2;
        for (int i = 0; i < listLength - 1; i++) {
            lista.add(arr1[i]);
        }

        for (int i = arr1.length - 1; i > listLength; i--) {
            listb.add(arr1[i]);
        }

        if (lista.equals(listb)) {
            System.out.println(" Verilen array simetriktir.");
        } else
            System.out.println("Verilen array simetrik değildir");


        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */
        String[] isimler = {"Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"};
        String eldeTutulanEleman = isimler[7]; // "Furkan" bunu elde tutuyorum.
        isimler[7] = isimler[2]; // 7. indextekini Furkanı Kerem yaptım.
        isimler[2] = eldeTutulanEleman;
        System.out.println(Arrays.toString(isimler));

/*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
     (Ignore case sensitivity)

     Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
   input : Learning java is easy
   output: maximumCounts occurring character is : a
    */
        //Kullanıcıdan String veri al
        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz: ");
        String str = input.nextLine().toLowerCase();

        //Alınan veriyi Character liste at.
        int counter = 0;
        List<Character> charList = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (charList.contains(ch)) {
                // Karakter zaten listede varsa, onun sayacını artır
                int index = charList.indexOf(ch);
                countList.set(index, countList.get(index) + 1);
            } else {
                // Karakter listede yoksa yeni karakter ve sayacını ekle
                charList.add(ch);
                countList.add(1);
            }
        }

        char maxChar = charList.get(0);//Kabul
        int maxCount = 0;

        for (int i = 0; i < charList.size(); i++) {
            if (countList.get(i) > maxCount) {
                maxCount = countList.get(i);
                maxChar = charList.get(i);
            }
            System.out.println("En çok tekrar eden karakter: " + maxChar + " , tekrar sayısı: " + maxCount);
        }

        /* TASK :
         * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
         * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
         * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
         */

        int[] array = { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
        List<Integer> ardToplam = new ArrayList<>();

        // Toplamı hesaplamak için gerekli olan değişken
        int currentSum = 0;
        int step = 1; // her seferinde toplayacağımız eleman sayısını tutacak

        for (int i = 0; i < array.length; i++) {
            currentSum = 0;

            // İç döngü ile adım sayısına göre toplam hesaplanır
            for (int j = i; j < i + step && j < array.length; j++) {
                currentSum += array[j];
            }

            // Toplamı yeni listeye ekle
            ardToplam.add(currentSum);

            // Her adımda toplayacağımız eleman sayısı artar
            step++;
        }

        // Sonuç dizisini yazdır
        System.out.println("Ardışık toplamlar: " + ardToplam);






/* TASK :
100 den kucuk asal sayilari yazdiran bir code create ediniz.
 */
                System.out.println("100'den küçük asal sayılar: ");

                for (int i = 2; i < 100; i++) {
                    if (asalMi(i)) {
                        System.out.print(i + " ");
                    }
                }
            }

            // Bir sayının asal olup olmadığını kontrol eden metod
            public static boolean asalMi(int sayi) {
                // 2'den başlayarak sayının kareköküne kadar olan sayılarla bölünebilirlik kontrol edilir.
                for (int i = 2; i <= Math.sqrt(sayi); i++) {
                    if (sayi % i == 0) { // Eğer sayı herhangi bir sayıya tam bölünürse asal değildir.
                        return false;
                    }
                }
                return true; // Hiçbir bölme işleminden kalansız çıkmazsa sayı asaldır.









/*
Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
1-1-2-3-5-8-13-21-34....
*/
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *         for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *         ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *         for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *         ortalama kazançtan aşağıysa o günleri return yap.
         * */
/* TASK:
        tas >makas
        makas >kagit
        kagit >tas

Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
While dongumuzun icerisinde kullanicidan aldigimiz secimi "secim" isimli degiskene atiyoruz.
Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.

 */
/*
   Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak
   ekleyen ve sonrasında her dakikanın ilk 10 saniyesinde kaydolanları
   şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.
   Bunun için;
   1- Bir user class oluşturun fields: name , registerDate (LocalDateTime cinsinden)
   2- Registration isminde bir class oluşturun ve register isminde bir metod
   ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin ve bu list i
   return edin.
   3- Registration classı na aynı zamanda kendine verilen
   ArrayListteki userlardan her dakikanın ilk 10  saniyesinde kaydolanları
   yazdıran printHappyUsers isminde bir metod daha ekleyiniz.

   İpucu Çalışacak main metodu aşağıdaki gibi olmalıdır.

   public static void main(String[] args) {
   Registration userReg = new Registration();
   ArrayList<User> register = userReg.register();
    userReg.printHappyUsers(register);
   }









   */
/*
Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
       olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
    (without case sensitivity)
    Eg : input : I love Java
    Output: "Reversed sentence : avaJ evol I
       It is not a palindrome"

 */
        /*String = daha yavas ,Immutable==> degisemez,

                StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
                StringBuffer synchronized,thread safe.

        StringBuilders = mutable==>degisebilir ,
                not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

        1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin  StringBuilder  class'i uretmistir.

        2) Java'da StringBuilder ile hemen hemen ayni isi yapan birde StringBuffer clasi vardir. "StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
        "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir. "StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
        3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
        Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.
                String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.
        Bunun iki sebebi vardir:
        1) Java pass-by-value kullanir 2) String Class'i immutable Class'dir. */
/*  Problem Tanımı
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)

        Verilen iki sayının permütasyonunu bulan kodu yazınız.
        Hatırlatma P(n,r) = n! / (n-r)!

        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365
        permütasyon: 32760

        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10
        permütasyon: 60
      */
    }
}

package d24collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {

        //Set’ler tekrarsiz(unique) datalari depolamak icin kullanilir. Ornegin; e-mail, tc kimlik no, il plaka no

        /*Java'da üç tür set vardır:
        1) HashSet: Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
        her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
        Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
        bir hücreye yerleştirilir.

        HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
        null'i eleman olarak kabul ederler */

        //-------------ek bilgi
        //Hash Code gormek istersek

        String a = "ali can";
        System.out.println(a.hashCode());  //mesela -916486578  //***heshcodlar herzaman unique(benzersiz) olmayabilir.

        //--------------------------------

        /*2) LinkedHashSet: Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
        bir settir. LinkedHashSet class'i, HashSet class'inin child'idir.
        LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
        Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)

        Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz

        3) TreeSet: Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
        HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
        Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
        Bu nedenle, TreeSet bir Sorted Set'tir.*/

        //HashSet nasil olusturulur?

        HashSet<String> hs = new HashSet<>();  //***İçinde hiçbirşey var. Boş yani, Null var denmez buna.//***Null içi boş obje demektir.

        //HashSet’e nasil eleman eklenir?
        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");

        System.out.println(hs); //[Kerem, Sinan, Tuba, Onur] //***Sırasız yazdırdı, karışık
        hs.add("Onur");
        System.out.println(hs);  //[Kerem, Sinan, Tuba, Onur] //Onur 2 tane ama üzerine yazdı.
        hs.add(null);

        System.out.println(hs);  //[Kerem, null, Sinan, Tuba, Onur] //Birileri boş veri geçmiş mi kontrolü için
        //***Kısa yoldan bura da setOf() ile ekleme yapabiliirim.


        //LinkedHashSet nasil olusturulur?

        LinkedHashSet<Integer> lhs = new LinkedHashSet();
        lhs.add(14);
        lhs.add(19);
        lhs.add(7);
        lhs.add(1);
        lhs.add(null);
        System.out.println(lhs);  //[14, 19, 7, 1, null]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(14);
        ls.add(19);
        ls.add(17);
        ls.add(11);
        System.out.println(ls);   //[14, 19, 17, 11]


        //retainAll() metodu, bir koleksiyondaki öğelerin başka bir koleksiyonla kesişimini
        // (yani her iki koleksiyonda da bulunan öğeleri-ortak) bulmak için kullanılır.
        lhs.retainAll(ls);
        System.out.println(lhs); //[14, 19]
        System.out.println(ls);  //[14, 19, 17, 11]


        //ODEV: Farkli olanlari bulan bir metot var mi?


        //--------------------------------------------------------------
        //TreeSet nasil olusturulur?

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        // ts.add(null); //HATA, null kabul etmez. //Çünkü Null'ın doğal sıralaması yoktur. Nereye koyacağını bilemez. Kabul etmez.
        System.out.println(ts);  //[A, G, R, U, Z] // National Order-Küçükten büyüğe sıralama

        //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
        //subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
        // oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
        // SortedSet türünden bir değişken oluşturmanız gerekir.

        SortedSet<Character> ss=ts.subSet('G', 'U');  //TreeSet diyemem parentinin ismini kullandım. yani SortedSet
        System.out.println(ss);  //[G, R]  //İlk index dahil, 2. dahil değil

        SortedSet<Character> ss2=ts.subSet('B', 'H');
        System.out.println(ss2); //[G]


        //Interview Sorusu
        //Ornek 1 : Ogrenci email adreslerini natural order’da siralanmis olarak depolayiniz.
        //Interview Question
        //Example 1 : Store student email addresses in natural order.


    }
}

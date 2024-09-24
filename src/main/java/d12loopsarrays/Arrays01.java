package d12loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.
        2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler,
        bir String dizisi sadece String değerler saklayabilir.
        3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer,
        Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.
        4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir
        5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.
        6)Array'ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
        (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.
    */


        //Array oluşturmak
        /*String[] stdName1 = new String[3];  //3 elemanlı String tipinde stdName1 adında bir Array oluşturdum. Bu yaygın
        String stdNames[] = new String[4];  //Böyle de olur.*/

        //Arrayler class değillerdir. Obje olarak kabul edilirler. Ama bazı classları da kullanabilirler.

        String[] stdName1 = new String[3];
        //  System.out.println(stdName1);  //Yanlış bu satır. Arrayler dogrudan yazdırılamaz.
        System.out.println(Arrays.toString(stdName1)); //[null, null, null]

        //Class ismiyle bir metoda ulaşabiliyorsam bu statik bir metotdur.

        //-----------------------------------------------
        //ornek 1: 5 elemanli notes adinda, int bir array olusturunuz ve console’a yazdiriniz

        int[] notes = new int[5];
        System.out.println(Arrays.toString(notes));  //[0, 0, 0, 0, 0]
        //-----------------------------------------------
        //ornek 2: 10 elemanli integers adinda, Integer bir array olusturunuz ve console’a yazdiriniz
        //Array’ler de non primitive (reference) veri tipleri de saklanabilir.
        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers));  //[null, null, null, null, null, null, null, null, null, null]
        //-----------------------------------------------
        //ornek 3: 3 elemanli names adinda, String bir array olusturunuz ve console’a yazdiriniz
        String[] names = new String[3];
        System.out.println(Arrays.toString(names)); //[null, null, null]


        //Array’e eleman eklemek
        //index mantigiyla ekleniyor. 0 ilk index demektir
        names[0] = "Ali Can";
        names[1] = "Veli Can";
        names[2] = "Ayşe Hanım";

        System.out.println(Arrays.toString(names)); //[Ali Can, Veli Can, Ayşe Hanım]

        //Bir veriyi görmek için ise
        System.out.println(names[1]);      //1. indexteki değeri görüntüledim.
        // ***Arrayin içinin tamamını görmek için Arrays.toString(names)
        names[0] = "Ömer Can";
        System.out.println(Arrays.toString(names));   //[Ömer Can, Veli Can, Ayşe Hanım]



        //boolean tipinde dizi oluşturma
        boolean[] flags = new boolean[5];  // 5 elemanlı bir boolean dizisi oluşturulur

// Dizinin elemanlarına değer atama
        flags[0] = true;
        flags[1] = false;
        flags[2] = true;
        flags[3] = false;
        flags[4] = true;

        for (boolean flag : flags) {
            System.out.println(flag);
        }


        //2.yol
        boolean[] flags1 = {true, false, true, false, true};  // Diziyi doğrudan değerlerle başlatma

        for (boolean flag : flags1) {
            System.out.println(flag);  // Elemanları yazdırma
        }

        //-----------------------------------------------

        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //      icerdigi karakter sayilari toplamini ekrana yazdirin.
        //Example 1: Create a String array, add 5 elements to it, all elements have
        // display the sum of the number of characters it contains.

        String[] cities = new String[5];
        cities[0] = "Bayburt";
        cities[1] = "Sivas";
        cities[2] = "Denizli";
        cities[3] = "Adana";
        cities[4] = "Ankara";

        //1. yol: for loop
        int totalchar = 0;

        for (int i = 0; i < cities.length; i++) {   //cities.length buradaki length fielddir. Direk dizi eleman sayısını veriyor.
            //Yani  buradaki length eşit değil length()
            totalchar = totalchar + cities[i].length();
        }
        System.out.println(totalchar);      //30


        //2.yol: for each loop (enhanced - geliştirilmiş loop)
        //for-each loop, Array, yani coklu veri iceren yapilarda kullanilir.
        //for loop’taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz
        //variable ismi olarak da genel kabul w’nun kullanilmasidir.

        /*        for (Datatype variable : array yada collections){
            calisacak kodlar
        }*/

        int sum = 0;
        for (String w : cities) {
            sum = sum + w.length();
        }
        System.out.println(sum);


        //Stringdeki karakter sayısı için
        String deneme="foreach kontrol";
        int sum1=0;
        for (char w:deneme.toCharArray())
        {
            sum1++;
        }
        System.out.println(sum1);



    }
}

package d7ternary_string;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String Data Tipi (Class)
        //String data tipi, cumleler, kelimeler, semboller, rakamlar icerebilir.

        //Ornek 1: "s" String'inde kullanilan karakter sayisini bulunuz.
        //Example 1: Find the number of characters used in String "s".


        String s = "Java is easy";
        int sLenght = s.length();
        System.out.println(sLenght);


        System.out.println("--------------------------------------------");

        //Ornek 2: "s" String'inde ilk ve son index'teki karakterleri aliniz.
        //Example 2: Get the characters in the first and last index of String "s".

        //charAt(int index) metodu, belirtilen index'te yer alan karakteri döndürmek için kullanılır.
        //Indeks 0 tabanlıdır, yani ilk karakterin indeksi 0'dır, ikinci karakterin indeksi 1, ve böyle devam eder.
        //Java'da indexleme, genellikle diziler (arrays), dizeler (Strings) veya koleksiyonlar (collections)
        // gibi bir veri yapısındaki belirli bir elemana erişmek için kullanılan bir tekniktir.

        char firstChar = s.charAt(0);
        System.out.println(firstChar); //J
        char lastChar = s.charAt(11);    //static code 11. indexi verdi
        System.out.println(lastChar);  //y
        char lastChar2 = s.charAt(s.length() - 1);//son karakteri verdi.
        System.out.println(lastChar2);  //dynamic kod


        //Not: s.length()-1 her zaman son index'i verir


        System.out.println("//-------------------------------------------");


        //Ornek 3: “s” String’indeki ilk 4 karakteri aliniz.
        //Example 3: Get the first 4 characters of the string “s”.
        //substring(int beginIndex, int endIndex): Belirtilen indeks aralığındaki substring’i döndürür.
        //substring(0, 4) ==> “0” yani ilk index dahil, “4" yani ikinci index haric dir. [0,4) İlginç ama 0. dahil 4. dahil değil.

        String sub1 = s.substring(0, 4);
        System.out.println(sub1);//Java

        System.out.println("//----------------------");
        //Ornek 4: “s” String’indeki “is” kelimesini aliniz.
//Example 4: Get the word “is” in String “s”.
        String sub2 = s.substring(5, 7);
        System.out.println(sub2);  //is

        System.out.println("//----------------------");
        //Ornek 5: “s” String’indeki “easy” kelimesini aliniz.
        //Example 5: Get the word “easy” in String “s”.

        String sub3 = s.substring(8, 12);
        System.out.println(sub3);  //easy

        System.out.println("//----------------------");
        //2.kullanimi: substring(int beginIndex): Belirtilen indeksten başlayarak sonuna kadar olan substring’i döndürür.
        String sub4 = s.substring(8);
        System.out.println(sub4);//easy

        System.out.println("//----------------------");
        //Ornek 6: "s" String'inde easy kelimesinin var olup olmadigini kontrol ediniz.
        //Example 6: Check if the word easy exists in the String "s".

        //contains() method'u herhangi bir karakterin veya karakterlerin String'de var olup olmadigini kontrol eder.
        //contains() methodu true veya false return eder. boolean
        boolean isExist = s.contains("easy"); //true
        System.out.println(isExist);

        boolean isExist1 = s.contains("Easy"); //false
        System.out.println(isExist1);


        System.out.println("//----------------------");
        //Ornek 7: “s” String’inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        //Example 7: Check if the string “s” starts with a certain letter.
        //startsWith() methodu bir Strig’in ilk karakterini/karakterlerini kontrol eder
        //startsWith() methodu boolean return eder.


        boolean startsWith = s.startsWith("Java"); //Büyük küçük harf duyarlılığı var. Küçük j olsaydı false döndürürdü.
        System.out.println(startsWith); //true


        boolean startsWith1 = s.startsWith("j");
        System.out.println(startsWith1); //false


        System.out.println("//----------------------");

        //Ornek 8: "s" String'inin "easy" ile bitip bitmedigini kontrol ediniz.
        //Example 8: Check if the string "s" ends with "easy".

        //endsWith() methodu bir Strig'in son karakterini/karakterlerini kontrol eder
        //endsWith() methodu boolean return eder.

        boolean isEnd = s.endsWith("easy");
        System.out.println(isEnd);//true


    }
}

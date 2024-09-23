package d8stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {
        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98
        //Example 1: Find the total price of the following products.
        //String tv = “$456.99”; String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98


        //****************valueOf ile stringi sayısal veriye çeviriyorum.


        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$", "");
        laptop = laptop.replace("$", "");

        Double totalprice = Double.valueOf(tv) + Double.valueOf(laptop);//double totalprice da yazabilirdik.
        // unboxing otomatik yaptı zaten
        System.out.println("totalprice = " + totalprice);


        System.out.println("//-------------------------------");
        //Ornek 2: Kullanici isminin ilk harflerini alip buyuk hale getirerek console'a yazdiriniz.
        //           "   ali cAN   " ==> AC
        //Example 2: Take the first letters of the username, capitalize them and write them to the console.

        //trim() metodu bir String’deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String’i istediginiz karakterden parcalamaya yarar.
        //Not: Bir satirda, birden fazla methodu yanyana kullanirsaniz buna “method chain (zincir)” denir

        String name = "   ali cAN  ";
        char first = name.trim().toUpperCase().charAt(0);  //trim ile baştaki ve sondaki boşlukları yok ettim.
        //toUpperCase ile tüm harfleri büyüttüm. charAt ile 0. indexteki harfi aldım.
        // Son method tipine göre değişken türünü belirledim. char first
        System.out.println("first = " + first);  //A

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);  //1 den fazla boşluk varsa split("\\s+") kullan
        System.out.println("last = " + last); //C

       System.out.println(""+first+last);


    }
}

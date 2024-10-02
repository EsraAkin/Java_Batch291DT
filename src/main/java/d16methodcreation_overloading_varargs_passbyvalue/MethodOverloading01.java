package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodOverloading01 {
    public static void main(String[] args) {
        /*
        Polymorphism:
        Method Overloading (static polymorphism) + Method Overriding(dynamic polymorphism)

        OOP'nin (Object Oriented Programming-Nesne yönelimli programlama) prensiplerinin biridir.
        Polymorphism (cok bicimlilik) demektir.
        Bir method'u, istedigimiz sonuclari alacak sekilde, farkli farkli sekilllerde calistirabilmek icin kullanilir.
        */  //Overload olmak birçok işi aynı anda yapmak.

        //String s="Java";
        // s.substring(int beginindex); ==>tek parametre almış.
        // s.substring(int beginindex, int endIndex); ==> iki parametre almış.

        add(3, 5);
        String s="Java";     //s burda hem değişken hem obje
        // s.substring()==> Bu metodu bir String objesi üzerinden çağırırız. Böyle metotlara non-static denir.
        //Class ismiyle çağrılanlar statiktir.

        //Math.min() ==> Bu methodu direkt class adiyla cagirdik. Boyle metotlara static denir

    }//main dışı

    public static void add(int a, int b) {
        System.out.println(a + b);

    }

    public static void add(double a, double b) {            //data tipini değiştirdim java bunu farklı method saydı.
        System.out.println(a + b);

    }

    public static void add(double a, int b) {            //data tipini değiştirdim java bunu yine farklı method saydı.
        System.out.println(a + b);

    }


    public static void add(int a, double b) {            //data tipini değiştirdim java bunu yine farklı method saydı.
        System.out.println(a + b);

    }


    public static void add(int a, int b, int c) {            //c ekledim. FArklı metot oldu
        System.out.println(a + b);

    }
    //--------------------------
    //String s="Java";
    // s.substring(int beginindex); ==>tek parametre almış.
    // s.substring(int beginindex, int endIndex); ==> iki parametre almış.

    //Method ismi+Parametre=Method Signiture (Method imzası) benzersiz olmalıdır.

    /* Method Overloading'de sadece parametreler degistirilir.
   Boylelikle method signature degismis olur ve Java bu methodu yeni bir method gibi kabul eder.

Method Overloading icin;
a) Parametre sayisini degistirebilirsiniz.
b) Parametre data tiplerini degistirebilirsiniz.
c) Parametre data tipleri farkli ise parametrelerin yerlerini degistirebilirsiniz.
d)Method overloading olustururken return type'in, access modifier'in,
   static veya non-static olmanin hicbir etkisi yoktur.
   //Yani static veya non-static olarak değiştirsem de aynı metot olarak kabul eder. Hataya düşürür.
   //Yani return type olarak int ya da void değiştirsem de aynı metot olarak kabul eder. Hataya düşürür.

   */
    //--------------------------
/*
Soru 1: private method'lar overload edilebilir mi?

Cevap 1: private method'lar overload edilebilirler cunku;
overload islemi tek class icinde yapilir, private methodlar ayni class'in icinden
ulasilabilir oldugundan overload'a engel degildir.

Soru 2: static method'lar overload edilebilir mi?
Cevap 2: static method'lar overload edilebilir cunku esasinda overload'da biz yeni method'lar olustururuz.
*/
//--------------------------

}
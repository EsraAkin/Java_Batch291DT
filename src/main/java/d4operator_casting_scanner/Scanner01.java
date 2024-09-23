package d4operator_casting_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        /*Java'da Scanner class'i, kullanıcıdan veya farklı bir kaynaktan girdi almanın oldukça kolay bir yolunu sağlar.

        1- Scanner class'i, farklı veri tiplerini (int, float, double, String, boolean vb.) kolaylıkla okuyabilir.
        2- Tek bir Scanner objesi, aynı girdi kaynağından farklı türlerde veri okuyabilir.
        3- next(), nextInt(), nextDouble() gibi farklı metotlar, farklı ihtiyaçlara uygun şekillerde kullanicidan girdi almayı sağlar.*/
        //--------------------------------------------
        //Ornek 1 : Kullanicidan yasini isteyip console’a yazdiriniz.
        //Example 1: Ask the user for their age and print it to the console.

        //1.adim: Scanner class'tan object olustur.
        //System.in (standart giris) uzerinden klavyeden giris okunur.
        Scanner input = new Scanner(System.in); // Scanner classtan input adında bir obje oluşturduk. Classtan oluşturulana obje ya da değişken denir.

        //2. adım: Kullanıcıya bilgi ver.
        System.out.print("Lütfen yaşınızı giriniz: ");

        //3.adim: Olusturdugumuz object uzerinden uygun method ile
        //kullanicinin girdigi veriyi alip memory'e yerlestirelim

        byte age = input.nextByte(); //yaş için byte uygun. Yıldızlı bilgi *** Objeler de metodları kullanabilir.
                                     //Burada input objesi nextByte() metodunu kullanıyor.

        System.out.println("Girilen yaş :" + age);


        //------------------------------------------------------------
        /*Java'da kütüphane, belirli bir işlevselliği sağlayan class'lar, interface'ler ve metotlar koleksiyonudur.
        Bu kütüphaneler, Java geliştiricilerinin daha hızlı ve etkili bir şekilde programlama
        yapabilmelerine olanak tanır. Java kütüphaneleri genellikle .jar (Java Archive) dosyaları olarak dağıtılır.

        Java'nın standart kütüphanesi (Java Standard Library), Java Development Kit (JDK) ile birlikte gelir
        ve dilin temel yapısını oluşturur. Java'da bir kütüphaneyi kullanabilmek için import anahtar kelimesi
        ile belirtilen class'lari projenize eklemeniz gerekir.*/
    }
}

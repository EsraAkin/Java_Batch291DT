package d28exception_enum;

public class E05 {
    public static void main(String[] args) {
        //****try blogundan sonra birden fazla catch bloğu kullanabilir miyiz? Evet. Birden fazla hata türü varsa kullanırım.
        int a = 12;
        int b = 1;
        String s = "My Java";
        getCharFromString(s, a, b);//a
        getCharFromString2(s, a, b);

    }//main dışı

    //1. Yol hataları tek tek yakalıyorum.
    public static void getCharFromString(String s, int a, int b) {
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
       } catch (ArithmeticException e) {  //b sıfır girilirse kullanılır.
            System.out.println("Sıfıra bölme yapılamaz. "+ e.getMessage());
        }catch (StringIndexOutOfBoundsException e){ // a/b index dışı değer döndürürse kullanılır.
            System.out.println("Olmayan index kullandınız. " +e.getMessage());
        }
    }

    //2.yol: Tum exception turlerini tek bir catch’te yakalamak icin “Exception” adli parent kullanilir //***Ama 1. yol daha iyiydi.

    public static void getCharFromString2(String s, int a, int b) {
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println("Bir istisna oluştu. "+ e.getMessage());  //Bir istisna oluştu. String index out of range: 12
        }
    }

}

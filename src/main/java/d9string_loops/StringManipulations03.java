package d9string_loops;

public class StringManipulations03 {
    public static void main(String[] args) {

        /*Ornek 1: Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin.

        1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.
        2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
        3- Başında ve sonunda boşluk olmamalıdır.*/

        /*Example 1: Check if a password has the following conditions.

        1- The password must contain at least one character, nothing must be entered.
        2- The characters must not only consist of (space) characters, but also non-space characters.
        3- There should be no spaces at the beginning and end.*/
        //Not: isEmpty() metodu sadece hicligi kontrol eder (true verir). Hiçlik varsa true verir.
        //isBlank() metodu ise hem hicligi hem de space’i kontrol eder(true verir)


        //-------------------------------------
        // 1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.
        String pwd = "esa";
        boolean first = pwd.isEmpty();
        System.out.println(first);


        //--------------------------------------
        //2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
        boolean second = pwd.isBlank();
        System.out.println(second);


        //-------------------------------------
        //3- Başında ve sonunda boşluk olmamalıdır.*/
        boolean third = pwd.trim().equals(pwd);
        System.out.println(third);


        if (first) {     //firstin içinde true varsa girer.
            System.out.println("Parola hiç bir şey yazmadan geçilemez.");
        }

        if (second) {
            System.out.println("Parola boş bırakılmamalı ve boşluk harici karakter bulunmalıdır.");

        }
        if (!third) {
            System.out.println("Parolanın başında ya da sonunda boşluk bırakılmamalıdır. ");
        }

    }
}

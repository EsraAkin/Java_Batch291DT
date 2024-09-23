package d10loops;

public class ForLoops02 {
    public static void main(String[] args) {
        /*Ornek 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        ==> "Tramvay"==> "Tr"*/
        /*Example 1: Write all characters before the first letter 'a' in a given String to the console*/

        //charAt() methoduna index verince size karakteri getirir.
        //break keyword’u, bir döngüyü veya bir switch ifadesini erken bir şekilde sonlandırmak için kullanılır.

        String s = "Tramvay";
        // int l = s.length(); //7


        for (int i = 0; i < s.length(); i++) { //i<=s.length()-1 de yazabilirdim.
            char ch = s.charAt(i); // s.charAt(i)sürekli string klasa gideck oyüzden değişkene atadım
            if (ch == 'v') {          //buradaki i 'a' karakterinin indexini verir. Bu da 'a' için 2'dir.
                break;                         //döngüyü kırdım

            }
            System.out.print(ch);  //s stringindeki i. karakteri yazdırır.
        }
        System.out.println();
   /*     String s = "Tramvay";
        int l = s.length(); //7


        for (int i = 0; i < s.length(); i++) { //i<=s.length()-1 de yazabilirdim.
            if (s.charAt(i) == 'a') {          //buradaki i 'a' karakterinin indexini verir. Bu da 'a' için 2'dir.
                break;                         //döngüyü kırdım

            }
            System.out.print(s.charAt(i));  //s stringindeki i. karakteri yazdırır.
        }

        */

        //Ornek 2: Verilen bir String'de kucuk harfleri console'a yazdirmayan kodu yaziniz.
        //"Pwd12?Ab" ==> P12?A

        //Example 2: Write the code that does not print lowercase letters in a given String to the console

        //regexle de yapabilirdim ama ASCII kullanarak yapacam.
        //ch>='a' ve ch<='z'

        String s1 = "Pwd12?Ab";    //içinde dolanmam gerek yani for döngüsü kullan.
        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                continue;  //geri kalan kodları yürütme, arttırma azaltmaya git.

            } else {
                System.out.print(ch);
            }

        }
        System.out.println();
        //-------------------------interview Sorusu--------------------

        //ornek 3: Verilen bir String'i tersden yazan kodu yaziniz.
        //example 3: Write the code that reverses a given String

        //           String t = "Ali Can";  ==> "naC ilA"
        //Loop olustururken baslangic ve bitis degeri cok onemlidir

        //son index her zaman length()-1’tir

        String t = "Ali Can";
        String reverse = "";  //ters çevirince bunun içinde saklayacağız. ilk adım bu olmalı. Memoryde yer açtım yani.
        for (int i = t.length() - 1; i >= 0; i--) {  //çünkü lenght-1 index numarasını verir.

            reverse = reverse + t.charAt(i);

        }

        System.out.println(reverse);
// ödev Sout forun içinde olsa ne olurdu?


    }
}

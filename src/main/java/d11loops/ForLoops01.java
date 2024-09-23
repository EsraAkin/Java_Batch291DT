package d11loops;

public class ForLoops01 {
    public static void main(String[] args) {
        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz.
        //example 1: Print the sum of the digits of a given integer to the console

        //           578 ==> 5+7+8=20 ==> Output 20 olmali


        //1.Yol

        int num = 578;
        int sum = 0;
        String strNum = String.valueOf(num);
        for (int i = 0; i < strNum.length(); i++) {
            sum += Integer.parseInt(String.valueOf(strNum.charAt(i)));
            // strNum.charAt(i) ile her karakteri alıp String'e ve sonra int'e çeviriyoruz

        }
        System.out.println("toplam: " + sum);  // Çıktı: 20


        //2. yol
        int sum2 = 0;

        for (int i = 578; i > 0; i = i / 10) { // i /= 10;
            sum2 = sum2 + i % 10;

        }
        System.out.println("sum = " + sum2); //sum2 = 20

        //----------------------------------------------
        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz.
        //Example 2: Write the code that returns the non-repeating characters in a String.
        // Yusuf ==> Ysf

        String t="Yusuf";
        String unique="";

        for (int i = 0; i <t.length() ; i++) {
           char ch= t.charAt(i); //index verdik, bize harfi yani karakteri verecek.

            if(t.indexOf(ch)==t.lastIndexOf(ch)){
                unique=unique+ch;
            }
        }
        System.out.println("Tekrarsız = " + unique);
    }
}

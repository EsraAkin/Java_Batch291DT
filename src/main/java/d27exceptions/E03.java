package d27exceptions;

import java.util.Stack;

public class E03 {
    public static void main(String[] args) {
        // 3) StringIndexOutOfBoundsException, bir String nesnesinin, karakter dizisindeki
        // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.


        String s = "Java";
        //selectCar(s, 2); //v
        selectCar(s, 5); //.StringIndexOutOfBoundsException
    }

    public static void selectCar(String s, int idx) {
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan index kullanmayınız! " + e.getMessage());
            //Olmayan index kullanmayınız! String index out of range: 5

            e.printStackTrace(); //kod yazan hatayı görmek isterse yazar. exceptionı gösterir ama fırlatmaz. // burayı yorum satırı yap anlarsın.
            // exeption fırlatılmasın ama ben exceptionı göreyim demek

        }

        System.out.println("App çalışıyor");
    }
}

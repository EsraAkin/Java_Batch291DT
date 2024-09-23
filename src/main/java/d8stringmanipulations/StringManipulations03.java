package d8stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        /*Example 1: Check the password entered by the user according to the following rules.

        i) At least 8 characters
        ii)Space character should not be in password
        iii) At least one capital letter
        iv) At least one lowercase letter
        v)At least one number */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz: ");
        String pwd = input.nextLine();  //Aslında next seçmem yeterli ama eğitimsiz kullanıcı boşluk bırakabilir.


        //i)En az 8 karakter olsun
        boolean lengthControl = pwd.length() > 7;
        //   System.out.println("lengthControl = " + lengthControl);

        // ii)Space karakteri password'de olmasin
        // boolean spaceKontrol=pwd.replaceAll("[^ ]", "").length()==0; //space hariç herğeyi sil,
        // uzunluk 0 mı kontrol et. Yöntem1 bu
        // boolean spaceKontrol=pwd.replaceAll("[^ ]", "").isEmpty();  //2.yöntem
        if (!lengthControl) {                                         //Hata nerden kaynaklı anlamak için bunu yaparım.
            System.out.println("Şifre en az 8 karakter içermelidir.");
        }
        boolean spaceKontrol = !pwd.contains(" ");  //3. yöntem en kolayı

        //    System.out.println("spaceKontrol = " + spaceKontrol);

        if (!spaceKontrol) {                                         //Hata nerden kaynaklı anlamak için bunu yaparım.
            System.out.println("Şifrede boşluk karakteri kullanmayınız.");
        }
        //iii)En az bir tane buyuk harf olsun


        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length() > 0;
        //   System.out.println("upperCaseControl = " + upperCaseControl);

        if (!upperCaseControl) {                                         //Hata nerden kaynaklı anlamak için bunu yaparım.
            System.out.println("Şifre en az 1 büyük harf içermelidir.");
        }
        // iv)En az bir tane kucuk harf olsun
        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", "").length() > 0;
        //   System.out.println("lowerCaseControl = " + lowerCaseControl);
        if (!lowerCaseControl) {                                         //Hata nerden kaynaklı anlamak için bunu yaparım.
            System.out.println("Şifre en az 1 küçük harf içermelidir.");
        }

        //v)En az bir tane rakam olsun */
        boolean numControl = pwd.replaceAll("[^0-9]", "").length() > 0;
        //  System.out.println("numControl = " + numControl);


        if (!numControl) {                                         //Hata nerden kaynaklı anlamak için bunu yaparım.
            System.out.println("Şifre en az 1 rakam içermelidir.");
        }

        //Ödev: En az 1 tane sembol içermeli.

        boolean symbolControl = pwd.replaceAll("[^\\p{Punct}]", "").length() > 0;
        System.out.println("symbolControl = " + symbolControl);


        if (!symbolControl) {                                         //Hata nerden kaynaklı anlamak için bunu yaparım.
            System.out.println("Şifre en az 1 sembol içermelidir.");
        }


        if (!symbolControl) {                                         //Hata nerden kaynaklı anlamak için bunu yaparım.
            System.out.println("Şifre en az 1 sembol içermelidir.");
        }

        boolean isValid = lengthControl && spaceKontrol && upperCaseControl && lowerCaseControl && numControl && symbolControl;
        if (isValid) {
            System.out.println("Şifre geçerlidir.");
        } else {
            System.out.println("Şifre geçersizdir.");
        }


    }
}

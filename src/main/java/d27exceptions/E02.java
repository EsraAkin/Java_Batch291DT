package d27exceptions;

public class E02 {
    public static void main(String[] args) {
        //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur

        String s = "1234";
        convertStringInt(s); //1234  //Burası hatasız çalışır. try-catch olmasa da

        String s1 = "1234a"; //.NumberFormatException //Metni sayıya çevirecekse ve metnin içinde harf varsa
        convertStringInt(s1);

    }//main dışı

    public static void convertStringInt(String s) {

        try {
            int intS = Integer.valueOf(s);
            System.out.println(intS);
        } catch (NumberFormatException e) {
            System.out.println("Dönüşüm için rakam dışı karakter kullanmayınız : " + e.getMessage());
            //Dönüşüm için rakam dışı karakter kullanmayınız : For input string: "1234a"
        }


    }

}

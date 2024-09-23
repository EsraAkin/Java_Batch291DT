package d9string_loops;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Ornek 1: Bir String’in belirli bir karakterinden baslayarak belirli bir karaktere kadar
        // tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail
        //Example 1: Starting from a specific character of a String up to a specific character
        // take all characters as dynamic.

        //1.Yol: Hard Coding, tavsiye edilmez.

        String a = "abc@gmail.com";
        System.out.println(a.substring(4, 9));  //gmail


        //2. yol: Dinamik
        String company1 = a.split("@")[1].split("\\.")[0]; //splitle önce 2'ye böldüm. 1.kısmı ladım.
        //sonra onu noktadan böldüm.0. kısmı aldım.
        System.out.println(company1);


        //3.yol :Dinamik
        //indexOf() method’u spesifik bir karakterin ilk gorunumunun index’ini verir
        //Bu method olmayan karakterler icin -1 verir

        int startingIndex = a.indexOf("@") + 1;    //Bana @in indexini verir. burda 3. Ama benim 4'e ihtiyacım old için +1 yaptım.
        // m arasaydık sadece 5 verirdi.
        int endingIndex = a.indexOf(".");        //9
        String companyname = a.substring(startingIndex, endingIndex);
        System.out.println(companyname);


    }
}

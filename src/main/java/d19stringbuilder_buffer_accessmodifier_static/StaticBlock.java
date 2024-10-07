package d19stringbuilder_buffer_accessmodifier_static;

public class StaticBlock {

    //***Bir variable olusturup deger atamazsaniz o variable’i initialize etmediniz demektir (=3.14) demedim
    //***StaticBlock mainden de önce çalısır yani
    //****static bloklar hep önce çalışır.

    static double pi;  //bunu global yaptım ki tüm methodlarda kullanbileyim.

    //------------------------------
    static { //static block   //***statik method 1 kere çalışır.
          pi = 3.14;  //değer atamayı static içinde yap. yani burda mesela
        System.out.println(pi);
        System.out.println("Static blok içi");

    }

    //-------------------------
    public static void main(String[] args) {
        /*"static" blok, bir class'in yüklenmesi sırasında otomatik olarak çalışan ve class'in başlatılmasını
        veya başlangıç ayarlarını yapmayı sağlayan bir özelliktir. Statik blok, yalnızca bir kez çalıştırılır.
         Bu bloklar örneğin, veritabanı bağlantıları için kullanılır.
         Bu, uygulamanın herhangi bir bölümünde veritabanına erişim gerektiğinde bağlantının hızlı
         bir şekilde hazır olmasını sağlar.*/

        //Ahçı başının yemek pişirmeye başlamadan önce malzemeleri hazır etmesi gibi.
        System.out.println(pi);
        System.out.println("main method içi");
    }
}

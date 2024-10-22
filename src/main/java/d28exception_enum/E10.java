package d28exception_enum;

public class E10 {
    public static void main(String[] args) {

        //finally ****finally içine yazılan kod hata olsun olmasın çalışır.

        /*
        1) finally bloğu genellikle;
         a) Kaynakların serbest bırakılması :  (veritabani baglantisinin kesilmesi, close() methodu ile),
             Özellikle eski Java versiyonlarında (Java 7 öncesi), veritabanı bağlantıları gibi kaynaklar
             manuel olarak kapatılmalıydı. Bu tür kaynaklar, uzun süre açık bırakılırsa sistemde gereksiz
             yere yer kaplar ve potansiyel performans sorunlarına neden olabilir. Java 7 sonrasi otomatiklesti ( try-with-resources ifadesi ile)

         b) Dosyaların kapatılması :  (az once dosya baglantisi yapmistik.  fis.close(); ile kapatilabilirdi)
            Dosyaları okuma veya yazma işlemi bittikten sonra kapatmak gereklidir. Aksi halde, dosya kolları
             gereksiz yere sistemde yer kaplar.

         c) Her durumda çalıştırılması gereken temizleme işlemleri :
         (Bazı işlemler, başarılı olsun ya da olmasın, belirli bir sürecin sonunda her zaman yapılmalıdır.

        Örneğin, bir log dosyasına her işlemin başlangıç ve bitiş zamanını kaydetmek gibi. BufferedWriter ile)

            // Coklu finally block kullanilamaz
            //java da try + bir catch, try + birden fazla catch, try + catch + finally,
            // try + finally kullanilabilir.  //düzeltme yapma ama hayatı gör yani




         finally icin bir senaryo olusturalim; a/b bolumu ile bir index bulalim ve bu index'i kullanarak
         Array'deki elemani bulalim
         */
        int a = 12;
        int b = 4;      //sıfır olunca // by zero /////////b'yi 1 yapınca Index 12 out of bounds for length 4
        int[] c = {3, 5, 7, 9};
        bring(c,a,b);  //9


    }//main dışı

    public static void bring(int[] c, int a, int b) {
        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("database ile bağlantıyı kesiniz. "); //***Yukarıda hata varsa da yoksa da bunu yap yani
            //database ile bağlantıyı kesiniz.
        }

    }

}
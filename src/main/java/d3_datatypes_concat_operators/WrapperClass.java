package d3_datatypes_concat_operators;

public class WrapperClass {
    public static void main(String[] args) {

        /*Java primitive data tiplerine yeni ozellikler(methodlar) ekleyerek yeni bir yapi olusturdu.
        Bu yapiya wrapper class denir. Wrapper class'lar, Java'nın primitive veri türlerini object olarak
        temsil etmek için kullandığı class'lardir. Bu özellik, primitive veri türlerini koleksiyonlarda
        (örneğin ArrayList gibi) kullanabilmek için oldukça kullanışlıdır, çünkü Java'da koleksiyonlar
        sadece Object referans türlerini kabul eder. Ayrica en onemlisi girdigimiz veriler uzerinde
        method kullaniminin da yolunu acar.*/

        //Wrapper'lar buyuk harfle baslar cunku class'tirlar.
        // primitive          : char          - boolean - byte - short - int         - long  - float  - double
        //wrapper class       : Character     - Boolean - Byte - Short - Integer     - Long  - Float  - Double

        int i = 12;
        //i. yaptığımızda metod açılmaz.
        Integer k = 12;
        //k. yaptığımızda metodlar açılır.
        //------------------------------------------------------------------------------------------------------------------

        //Autoboxing - Unboxing
        /*Java'da primitive(ilkel) türler ve wrapper sınıfları arasında otomatik dönüşüm yapabilen
        autoboxing ve unboxing mekanizmaları vardır.
        **Autoboxing, primitive bir türü otomatik olarak onun
        wrapper sınıfına çevirir. Örneğin, long'u Long'a dönüştürür. Unboxing ise tam tersi bir işlem yapar,
        Long'u long'a dönüştürür. Ikisi de otomatik gerceklesir.*/


        //Ornek 1 : primitive int’i wrapper Integer’a ceviriniz.
        //Example 1: Convert primitive int to wrapper Integer

        int num = 13;
        Integer wrapperNum = num; // Autoboxing yaptık. int olan numu  Integer kullanarak wrapper yaptık. İlkellerde method kullanımı yok çünkü.
        // 13 için artık method kullanabiliriz. Amaç bu yani.

        Byte s = 19;
        byte primativeS = s;   // Unboxing yaptık. Basit işlemler için kullanacaksam; metoda ihtiyacım yok. O yüzden bu dönüşümü yaptım.
    }


}

package d2variables;

public class Variables01 {



    public static void main(String[]args){
//Java bu satırı okumaz. Kendimize veya başkasına açıklamadır.
    /*
        1) Java dili Strongly Typed’dir, bu nedenle Java’daki her değişken(variable), belirli
        veri türü(data type) ile iliskilendirilmelidir.
        2) Kod yazanin değişkenlere uygun değerlerin atandığından emin olması her zaman gerekir.
        Aksi takdirde hata oluşur.
    */
byte studentAge = 35;
System.out.println(studentAge); //35

short sitePopulation=1200;
System.out.println(sitePopulation);//1200

int countyPopulation=87000000;
        System.out.println(countyPopulation);
        System.out.println("Türkiye countyPopulation = " + countyPopulation);

 int a, b;
 a=12; b=13;
 int toplamSonuc=a+b;
        System.out.println("toplamSonuc = " + toplamSonuc);
        System.out.println("toplam sonuc= " +(a+b));



    }
}

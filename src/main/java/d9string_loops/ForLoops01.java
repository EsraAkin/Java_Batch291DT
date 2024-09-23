package d9string_loops;

public class ForLoops01 {
    public static void main(String[] args) {
        //Döngüler (Loops) tekrar eden kodlama işlerini kolaylaştırmak için kullanılır.
//Tüm kod parçalarını belirli bir kural döngüsü içinde tekrarlamak için kullanılır.

        //ornek 1: Console'a 4 kere 'Hi!' yazdirin
//example 1: Type 'Hi!' 4 times in the console

//1.Yol: Tavsiye edilmez.Not recommended
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
//2.Yol
       /*
        for (Baslangic degeri; Loop calisma Kurali; Artirma/ Eksiltme) {
            Calisacak Kodlar
        }
*/
        //Baslangic degeri; Loop calisma Kurali; Artirma/ Eksiltme)
        // for (int i = 0    ;     i < 4          ;     i++) {
        for (int i = 1; i < 5; i++) { //i<=4 ve i=i+1 de olurdu.

            System.out.println("Hello");  //Ekrana 4 kez Hello yazdırdı.

        }
    }

}


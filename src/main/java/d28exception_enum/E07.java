package d28exception_enum;

public class E07 {
    public static void main(String[] args) {

        printAge(25); //25
        printAge(-5);  //Yaş negaif olamaz. Java bunu bilmez. Bun Javaya biz öğreteceğiz.

        //6) IllegalArgumentException, bir metodun geçersiz bir argüman aldığında oluşan bir hata türüdür.
    }

    //Girdigimiz yasi konsola yazdiran bir method olusturalim

    //Exception olustugunda bunu ilan eder ve geri cekilirsiniz, buna da throw exception denir.
    // try-catch kullanmazsiniz.Burda programin durmasi kesinlikle isteniyordur.

    public static void printAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Yaşı negatif girmeyiniz. ");

        } else {
            System.out.println(age);
        }


        System.out.println(age);
    }
}

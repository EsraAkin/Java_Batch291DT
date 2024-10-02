package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodCreation02 {
    public static void main(String[] args) {
        int result1 = multipy(3, 5);
        System.out.println(result1);

        int result2 = firstTwoMultiplyThirdAdd(4, 4, 2);
        System.out.println(result2);

       print("Ali Can");


    }//maindışı

    //ornek 1: Iki sayiyi carpan bir method olusturunuz.
    //example 1: Create a method that multiplies two numbers
    protected static int multipy(int a, int b) {          //protected: Bu class’tan erisilebilir.
        //Bir de sadece miras alinan class’lardan erisilebilir(extends)
        return a * b;
    }
    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz.
    //example 2: Create a method that multiplies the first two of the given 3 numbers and adds the result with the third number.

    //private : Buraya sadece ayni class icerisinden erisilebilir.Diger class’lar erisemez.
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return a * b + c;
    }
    //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)
    //example 3: Create a method that prints an entered word to the console


    public static void print(String str) {
        System.out.println(str);
    }

}

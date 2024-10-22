package d27exceptions;

import java.lang.reflect.Array;

public class E04 {
    public static void main(String[] args) {
        // 4) ArrayIndexOutOfBoundsException: Bir dizi elemanına erişilmeye çalışıldığında,
        // dizi boyutunu aşan bir indeks kullanıldığında meydana gelir.

        String[] arr = {"j", "a", "v", "a"};
        getElementFromArray(arr, 1); //a
        getElementFromArray(arr, 15); //ArrayIndexOutOfBoundsException
    }


    public static void getElementFromArray(String[] s, int idx) {

        try {
            String el = s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index numarası " + (s.length - 1) + " den büyük olamaz");
        }

    }
}

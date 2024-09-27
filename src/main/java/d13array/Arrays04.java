package d13array;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz(Interview Sorusu)
        //Example 4: In the array [0, 2, 3, 0, 12, 0], place all zeros at the end.
        //     [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        int[] arr = {0, 2, 3, 0, 12, 0};
        int[] newArr = new int[arr.length];         //şu anda null tutuyor. arr sayısınca
        System.out.println(Arrays.toString(arr));   //[0, 2, 3, 0, 12, 0]
        System.out.println(Arrays.toString(newArr));//[0, 0, 0, 0, 0, 0]

        int firstIndex = 0;  //index'lere yukleme yaptikca bunu 1 artiracagiz
        for (int w : arr) {
            if (w != 0) {

                newArr[firstIndex] = w; //Boş array'in ilk indexine sıfır olmayan sayıyı yükledik.

                firstIndex++;           //Bunu yazmazsam sürekli ilk indexe yükleme yapar.
                // ilk index'e yukleme yapildigi icin, bir sonraki sifir harici sayi ilk index'e yuklenmesin diye 1 artirdik

            }
        }

        System.out.println(Arrays.toString(newArr));  //[2, 3, 12, 0, 0, 0]
    }
}
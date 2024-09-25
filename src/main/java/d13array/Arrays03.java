package d13array;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
        //Example 1: Create an int array and write the elements less than 5.
        //      [12, 3, -3, 5, 23] ==> 3, -3


        //int[] numbers = new int[5]; ya da
        int[] numbers = {12, 3, -3, 5, 23};
        System.out.println(Arrays.toString(numbers));  //[12, 3, -3, 5, 23]
        System.out.println(numbers[2]);                 //-3

        for (int w : numbers) { //w, dizideki her bir elemanı temsil eder. Yani w sırayla 12, 3, -3 .....olur.

            if (w < 5) {
                System.out.print(w+", ");
            }
        }

        //--------------------------------------------
        System.out.println("//-------------------------------");
        //Ornek 2: Spesifik bir elemanin Array’de olup olmadigini anlamak icin gereken kodu yaziniz.
        //Example 2: Write the code to find out if a specific element is in Array
        //binarySearch() methodu var olan elemanlar icin size o elemanin index’ini verir
        //binarySearch() methodunu sort() kullanmadan kullanmayiniz
        //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
        // “-” ==> isaretinin anlami eleman yok demektir
        String names[]= {"A", "T", "K", "E", "B"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));  //[A, B, E, K, T]

        int result=Arrays.binarySearch(names, "B");  //names dizisinin içinde B araması yaptırıyorum.
        System.out.println(result); //1 yani B 1. indexte.

        int result2=Arrays.binarySearch(names, "C");  //names dizisinin içinde B araması yaptırıyorum.
        System.out.println(result2); //-3 yani C yok ama olsaydı 3. sırada olurdu. Yani 2. indexte olurdu.(-3-(-1))


        int[] arr={2,1,7,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  //[1, 2, 6, 7]
        System.out.println(Arrays.binarySearch(arr, 2)); //1 //1. yani indexte
        System.out.println(Arrays.binarySearch(arr, 7)); //3
        System.out.println(Arrays.binarySearch(arr, 3)); //-3
        System.out.println(Arrays.binarySearch(arr, 9)); //-5

        System.out.println("//---------------------");
        String[] s = {"A", "C", "B", "D"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s)); //[A, B, C, D]
        System.out.println(Arrays.binarySearch(s, "A"));  //0
        System.out.println(Arrays.binarySearch(s, "C"));  //2
        System.out.println(Arrays.binarySearch(s, "E"));  //-5  yani 5. sırada yani olsaydı 4. indexte olurdu.
        System.out.println(Arrays.binarySearch(s, "G"));  //-5  yani 5. sırada yani olsaydı 4. index

        //---------------------------------------

        //ARASTIRMA ODEVI: Java'da char veya boolean turunde bir array olusturabilir misiniz?

        System.out.println("//------------------------");
        //Ornek 3: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        //Example 3: Write the code that shows you how many words are in a given sentence.
        //String s = “Java is easy. Learn Java earn money.“;


        String s1 = "Java is easy. Learn Java earn money.";

        System.out.println(s1);
        String[] words= s1.split(" ");  //splitle boşluklardan parçalayıp diziye attım.
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);  //7

    }
}

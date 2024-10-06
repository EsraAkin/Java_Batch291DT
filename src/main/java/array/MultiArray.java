package array;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {

        int[][] sayilar = new int[3][2];  //eleman sayısı

        //----------------------------------------------------
        String[][] students = {{"Ali", "Kemal"}, {"Cemal"}, {"Aziz"}};
        students[2][0] = "Ahmet";
        System.out.println("dd" + Arrays.deepToString(students));  //[Ali, Kemal], [Cemal], [Ahmet]


        System.out.println(Arrays.deepToString(students));  //[[Ali, Kemal], [Cemal], [Aziz]]

        //****** Tek boyutlu Array[] yazdırmak için Arrays.toString yeterliyken, çok boyutlu için Arrays.deepToString()
        //****** Tek boyutlu bir dizide eleman tek for ile ulaşabilirim, 2 boyutluda nested 2 for
        //******for-each mi for loop mu? Elemanlarla oynamıycaksam sadece gezeceksem for-each

        //Ornek 1: int turunde bir Multidimensional Array’deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        //Example 1: Find the sum of the smallest and largest element in a Multidimensional Array of type int.

        int[][] ages = {{15, 4}, {12, 43, 21}}; // ==> 4 + 43 = 47

        int smallest = ages[0][0]; //15  //[0][0] minimum kabul ettim
        int biggest = ages[0][0]; //15   //[0][0] minimum kabul ettim

        for (int[] w : ages) { //{15, 4}
            for (int k : w) {
                smallest = Math.min(smallest, k);
                biggest = Math.max(biggest, k);
            }
        }
        System.out.println(smallest); //4
        System.out.println(biggest); //43
        System.out.println(biggest + smallest); //47


    }
}

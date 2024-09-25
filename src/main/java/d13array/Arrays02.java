package d13array;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.
        //Example 1: Create an Array of type int called ages and place 6 elements in it,
        // display the sum of the smallest and the largest of these elements

        int[] ages=new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;

        //1. Yol
       /* System.out.println(Arrays.toString(ages));  //[20, 23, 19, 44, 15, 32]
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[ages.length-1]);*/

        //----------------------
        //2. Yol Min max sorularında önce ilk indextekini min ve max olarak kabul et.
        int minimum =ages[0];
        int maximum= ages[0];

        for(int w:ages) {
            minimum = Math.min(minimum, w); //15 //Math metodu. Bizden 2 parametre ister. Bu ikisini karşılaştırmak için
            System.out.println(minimum);

            maximum = Math.max(maximum, w); //44
            System.out.println(maximum);
        }
            System.out.println("En küçük ve en büyük toplamı= " +(maximum+minimum)); //59
        }
    }


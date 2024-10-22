package d26maps_exceptions;

import java.util.Arrays;
import java.util.HashMap;

public class Task {
    public static void main(String[] args) {

        //ODEV: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
        //example 2: Write the code that shows how many times each letter in a given String is used in that String.
        //           "Hello" ==> H=1, e=1, l=2, o=1

        String s = "Hello";

        //Her kelimeyi bir diziye atalım.
        String[] words=s.split("");
        System.out.println(Arrays.toString(words)); //[h, e, l, l, o]


        HashMap<String, Integer> myMap=new HashMap<>();
        for(String w: words){

            Integer isThere=myMap.get(w);
            if(isThere==null){
                myMap.put(w,1);
            }else{
                myMap.put(w,isThere+1);
            }
        }
        System.out.println(myMap); //{e=1, h=1, l=2, o=1}


    }
}

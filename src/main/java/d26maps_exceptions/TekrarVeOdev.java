package d26maps_exceptions;

import aKendiCalisma.ArrayList;

import java.util.Arrays;
import java.util.HashMap;

public class TekrarVeOdev {
    public static void main(String[] args) {
        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)
        //example 1: Given a String, count the number of times each word is used in that String
        // write the code that displays.(Case insensitive)

        String s = "Ali nasilsin Ali.";

        //Önce stringi noktalama işaretlerinden kurtaralım.

        s = s.replaceAll("\\p{Punct}", "").toLowerCase();
        System.out.println(s);  //ali nasilsin ali

        //Her kelimeyi bir diziye atalım.
        String[] words=s.split(" ");
        System.out.println(Arrays.toString(words)); //[ali, nasilsin, ali]

        HashMap<String, Integer> myMap=new HashMap<>();
        for(String w: words){

            Integer isThere=myMap.get(w);
            if(isThere==null){
                myMap.put(w,1);
            }else{
                myMap.put(w,isThere+1);
            }
        }
        System.out.println(myMap);



    }
}

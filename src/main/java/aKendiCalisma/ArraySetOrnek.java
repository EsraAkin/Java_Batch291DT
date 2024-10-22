package aKendiCalisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraySetOrnek {
    public static void main(String[] args) {
        List<String> personel = new ArrayList<>();
        personel.add("Ali");
        personel.add("Ahmet");
        personel.add("mehmet");
        personel.add("Pınar");
        personel.add("deniz");
        personel.add("Samet");
        personel.add("Gül");
        personel.add("Demet");
        System.out.println(personel);                //[Ali, Ahmet, mehmet, Pınar, deniz, Samet, Gül, Demet]
        List<Integer> maas = new ArrayList<>(Arrays.asList(1000, 2000, 3000, 4000, 2000, 1000, 2000, 5000));
        System.out.println("Eski maaş=" + maas);

        Scanner input = new Scanner(System.in);
        System.out.println("Personel seç");
        String secilenPersonel = input.next();

        System.out.println("Alinin indexi " + personel.indexOf("Ali"));


        int alininYeniMasi = maas.set(personel.indexOf("Ali"), 2000);
      //  System.out.println("Alinin yeni maaşı: " + (alininYeniMasi + 500));

        System.out.println(maas);

        System.out.println(maas.get(0)); //2000
        System.out.println(personel.get(0) + " kişisinin maaşı " + maas.get(0));


//        String secilenPersonelAdi=personel.get(secilenPersonel);
//        System.out.println("secilenPersonelAdi = " + secilenPersonelAdi);
//        int secilenPersonelMaasi=maas.get(secilenPersonel);
//        System.out.println("secilenPersonelMaasi = " + secilenPersonelMaasi);;

        //Alinin maaşına 1000 zam yap


        //Mesela maaşı 2000 liranın altında olanlara 500 zam yap

//        for (int i = 0; i <maas.size() ; i++) {
//           if( maas.get(i)<2000){
//              maas.set(i,maas.get(i)+500);
//           }

//        }
//
//        System.out.println("Zamlı maaşlar: "+maas);

    }
}

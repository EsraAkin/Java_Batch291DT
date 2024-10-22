package aKendiCalisma;

import java.util.Arrays;
import java.util.Scanner;

public class TaskArrayBetulH {
    public static void main(String[] args) {
        /* TASK 1 :
         kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
         ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
         java code create ediniz.

         */
        System.out.println("//Task 1-------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç elemanlı bir dizi oluşturmak istersiniz: ");
        int elemansayisi = input.nextInt();

        int[] sayilar = new int[elemansayisi];

        for (int i = 0; i < elemansayisi; i++) {
            System.out.println("Diziye eklemek istediğiniz sayıyı giriniz: ");
            sayilar[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(sayilar));

        int min = sayilar[0];
        int max = sayilar[0];
        for (int w : sayilar) {
            if (w < min) {
                min = w;
            }
        }

        for (int w : sayilar) {
            if (w > max) {
                max = w;
            }
        }
        System.out.println(max);

        System.out.println("En büyük sayı: " + max + ", En küçük sayı: " + min);
        System.out.println("Aradaki fark: " + (max - min));




        /* TASK 2 :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33} */
        System.out.println("//Task 2-------------------------------------");
        int[][] sayilar2 = {{10, 20, 30}, {4}, {6, 7, 20}};
        int index = 0;
        int[] bosArray = new int[sayilar2.length];
        for (int[] w : sayilar2) {

            int sum = 0;
            for (int k : w) {
                sum = k + sum;

            }
            bosArray[index] = sum;
            index++;
        }
        System.out.println(Arrays.toString(bosArray));


        /* TASK 3 :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
        */
        System.out.println("//Task 3-------------------------------------");
        int[] eksiArti = {1, 2, -3, 4, -5, -6};
        int[] bosArtiEksi = new int[eksiArti.length];
        int index1 = 0;

        int carpim = 1;
        for (int w : eksiArti) {
            carpim = w * (-1);
            bosArtiEksi[index1] = carpim;
            index1++;
        }

        System.out.println("Artı eksi: " + Arrays.toString(bosArtiEksi)); //Artı eksi: [-1, -2, 3, -4, 5, 6]



        /*  TASK 4 :
         *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */
        System.out.println("//Task 4-------------------------------------");
        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int istenenToplam = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] + arr[j] == 9) {

                    System.out.println(i + ". ve " + j + " . index taolamı: " + "9");

                }
            }
        }


        /*  TASK 5 :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */
        System.out.println("//Task 5-------------------------------------");
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int w : arr2) {
            sum = sum + w;
        }
        int ort = sum / arr2.length;
        for (int w : arr2) {
            if (w > ort) {
                System.out.print(w + ",");
            }
        }

        System.out.println();

        /*TASK 6 :
        write a java program to find the second largest number in the array?
        Maximum and minimum number in the array?
        (Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
        bulmak için bir java programi yazin)

        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
        */
        System.out.println("//Task 6-------------------------------------");

        int[] arr3 = {100, 10001, -90, 845, 8787, 898, 0, 1, -90};
        Arrays.sort(arr3);
        System.out.println("sıralı hali :" + Arrays.toString(arr3));
        int arrUzunluk = arr3.length;
        System.out.println("Dizideki en büyük 2. sayı= " + (arr3[arrUzunluk - 2]));
        System.out.println("Dizideki en büyük sayı= " + (arr3[arrUzunluk - 1]));
        System.out.println("Dizideki en küçük sayı= " + (arr3[0]));


        /* TASK 7 :
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 8
         */

        int[][] sayilarr = {{1, 2, -3}, {41, 55}, {-61, -17, 80}};

        int maxSayi = sayilarr[0][0];  //Kabul

        for (int[] w : sayilarr) {
            for (int k : w) {
                maxSayi = Math.max(maxSayi, k);
            }
        }
        System.out.println("Dizideki maksimum değer= " + maxSayi);

        /*
        System.out.println("//Task 7-------------------------------------");
         TASK 8:
         $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

              String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
              */
        System.out.println("//Task 8-------------------------------------");

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";


        String[] s = str.split(" ");
        int total1 = 0;
        int total2 = 0;

        for (String w : s) {
            if (w.contains("$")) {
                total1 = total1 + Integer.valueOf(w.replace("$", ""));
            } else if (w.contains("£")) {
                total2 = total2 + Integer.valueOf(w.replace("£", ""));
            }
        }
        System.out.println("$ toplamı = " + total1);
        System.out.println("£ toplamı = " + total2);


        /* TASK 9:
      given an int array and find the squares of the elements
      (Verilen bir int dizisi icin elemanlarin karelerini bulun )
      Example:{2,6,4,5,8,9}
      output:{4,36,16,25,64,81}
      */
        System.out.println("//Task 9-------------------------------------");

        int[] dizi = {2, 6, 4, 5, 8, 9};
        int[] kare = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            kare[i] = dizi[i] * dizi[i];
        }
        System.out.println(Arrays.toString(kare));


        /*
         TASK 10:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )
         */
        System.out.println("//Task 10-------------------------------------");
        String strGayet = "GayetBasarılı";
        System.out.println(strGayet);
        char[] ch1 = strGayet.toCharArray(); // String'i bir karakter dizisine dönüştür. ==>(char[])
        System.out.println(Arrays.toString(ch1));
        char[] ch2 = {'C', 'o', 'o', 'o', 'k'};
        for (int i = 0; i < ch2.length; i++) {
            ch1[i] = ch2[i];
        }
        System.out.println(Arrays.toString(ch1));

        String sYeni = new String(ch1);
        System.out.println(sYeni);

    }
}

package d11loops;

import java.util.Scanner;

public class ForLoops04 {
    public static void main(String[] args) {
        /* Ornek 2:  Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz.
        Example 2:  Create the code that prints the following figure to the console.

      X X X X X
      X X X X X
      X X X X X    */

        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz: ");
        int row = input.nextInt();

        System.out.println("Sütun sayısını giriniz: ");
        int colomn = input.nextInt();

  //      System.out.println("Karakter gir: ");
   //     char ch = input.next().charAt(0);


        for (int i = 0; i < row; i++) {

            for (int j = 0; j < colomn; j++) {
                System.out.print("X");    //X X X X X
            }
            System.out.println();          // Alt satıra geçirir.
        }
/*Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
Homework: Draw the following figure using for-loop.

	*
	* *
	* * *
	* * * *

*/
        for (int i = 1; i <5 ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

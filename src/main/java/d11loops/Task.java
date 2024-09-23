package d11loops;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        /*Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
Homework: Draw the following figure using for-loop.

	*
	* *
	* * *
	* * * *

*/
        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz: ");
        int row = input.nextInt();

        for (int i = 0; i < row; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();          // Alt satıra geçirir.
        }

    }
}

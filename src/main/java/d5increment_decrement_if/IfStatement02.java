package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı gir: ");
        int num = input.nextInt();

        if (num % 2 == 0) {

            System.out.println("Girilen sayı çifttir :");

        }
        if (num % 2 != 0) {    //num%2==1 şeklinde de yazabilirdik.

            System.out.println("Girilen sayı tektir :");

        }

        //---------------2. Yol:
        //if - else Statements

        if (num % 2 == 0) {
            System.out.println("Sayı çifttir.");

        } else {
            System.out.println("Sayı tektir.");

        }


    }
}

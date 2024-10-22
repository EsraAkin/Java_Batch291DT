package d24collections;

import java.util.Scanner;
import java.util.TreeSet;

public class Task {
    public static void main(String[] args) {
        //Interview Sorusu
        //Ornek 1 : Ogrenci email adreslerini natural order’da siralanmis olarak depolayiniz.
        //Interview Question
        //Example 1 : Store student email addresses in natural order.

        Scanner input = new Scanner(System.in);
        System.out.println("Mail adresini giriniz: ");
        String mail;
        TreeSet<String> treeMail = new TreeSet<>();

        do {
            mail = input.next();
            if (!mail.equalsIgnoreCase("Q")) { // Eğer 'Q' girilmezse e-posta adresini ekle
                treeMail.add(mail);
                System.out.println("Yeni bir mail adresi girin ya da çıkmak için 'Q' yazın:");
            }
        } while (!mail.equalsIgnoreCase("Q")); // Kullanıcı 'Q' yazarsa döngü sonlanır

        System.out.println(treeMail);

    }
}

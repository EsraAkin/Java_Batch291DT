package d12loopsarrays;

import java.util.Scanner;

public class DoWhileLoops02 {
    public static void main(String[] args) {
        /*Ornek 1:
       Gecerli Username="admin" ve Password="pwd123" dur.
       Kullanicidan username ve password'u alin.
       Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
       Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
       Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.
*/
         /*
Example 1:
       Valid Username="admin" and Password="pwd123".
       Get the username and password from the user.
       If the username and password are correct, print "Welcome to your account!" to the console.
       If the username or password is incorrect, prompt "Enter your username and password" 4 times.
       If the username or password is entered incorrectly for the 4th time, complete the process with the message "Your account is blocked".
*/

        Scanner input = new Scanner(System.in);
        int counter = 0;      //kalan hak kontrolü yapmak için ekledik.

        do {
            if (counter == 4) {
                System.out.println("Hesabınız bloke olmuştur!");
                break;

            }

            System.out.println("Lütfen username giriniz: ");
            String username = input.next();

            System.out.println("Lütfen password Giriniz: ");
            String password = input.next();


            if (username.equals("admin")&&password.equals("pwd123")){
                System.out.println("Hesabınıza Hoşgeldiniz.");
                break;
            }else {
                System.out.println("Hatalı giriş. Kalan hak " +(3-counter));
                counter++;
            }

        } while (true);//sonsuz döngü oluşturduk. İçerden kırılmadığı sürece çalışacak.


    }
}

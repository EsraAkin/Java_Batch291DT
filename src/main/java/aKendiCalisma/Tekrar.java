package aKendiCalisma;

public class Tekrar {
    public static void main(String[] args) {

        stringBuilder(3, 4);


        StringBuilder sb2 = new StringBuilder("Java");

        System.out.println("capacity builder " + sb2.capacity());
        String a = sb2.toString();
        System.out.println(a);
        StringBuilder sb4 = new StringBuilder(a);
        System.out.println("d" + sb4);
        System.out.println(sb4.length());







    }
public static String stdName="Ali";

    public static void stringBuilder(int a, int b) {
        StringBuilder sb1 = new StringBuilder("deneme");
        sb1.append("ler!!!!");
        System.out.println(sb1);
        System.out.println(a + b);
        return;
    }


}

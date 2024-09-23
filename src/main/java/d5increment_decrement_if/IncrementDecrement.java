package d5increment_decrement_if;

public class IncrementDecrement {
    public static void main(String[] args) {

        //-------------------------Increment
        int a = 5;
        a = a + 2; //a 2 defa yazılmış. Bunu daha düzgün yazsak a+=2; yani a yı arttır 2 sonra da aya yukle
        System.out.println(a);

        a += 2;
        System.out.println(a); //9

        //-------------------------Decrement

        int c = 10;
        c = c - 3;
        System.out.println(c); //7
        c -= 4; //c=c-4; ün aynısıdır.
        System.out.println(c); //3

        //--------------çarpma
        int d = 6;
        d = d * 2;
        System.out.println(d); //12
        d *= 2;
        System.out.println(d); //24

        //--------------bölme
        int e = 24;
        e = e / 2;
        System.out.println(e); //12
        e /= 2;
        System.out.println(e); //6


        //-----------------1 ile Incremant
        int f = 13;
        f = f + 1;
        f += 1;
        f++;
        System.out.println(f);  //16

        //-----------------1 ile decrement
        int h = 15;
        h = h - 1;
        h -= 1;
        h--;
        System.out.println(h);
        System.out.println(h);//12


        //-------Post Increment (i++), Pre Increment(++i)

        int i = 10;
        int k = i++;

        System.out.println(i); //11
        System.out.println(k); //10

        int m = 15;
        int n = ++m;
        System.out.println(m); //16
        System.out.println(n); //16


        int p = 17;
        int r = p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int s=20;
        int t =--s;
        System.out.println(s); //19
        System.out.println(t); //19


    }
}

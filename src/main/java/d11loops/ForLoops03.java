package d11loops;

public class ForLoops03 {
    public static void main(String[] args) {
        /*
        ornek 1: Asagidaki ciktiyi verecek 4 kodu yaziniz
        Example 1: Write the code to give the following output
            Week: 1
                Day: 1
                Day: 2
                Day: 3
                .....
            Week: 2
                Day: 1
                Day: 2
                Day: 3
                ....    */

        for (int i = 1; i < 5; i++) {
            System.out.println("Week: " + i);
            for (int j = 1; j < 8; j++) {
                System.out.println("       Day:" + j);
           }

        }

    }
}

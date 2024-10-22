package d28exception_enum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Kendi {
    public static void main(String[] args) {


        try {
            int a[] = {7, 8, 9};
            for (int i = 1; i <= 3; i++) {
                System.out.println(a[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of index");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Donei");
        }
    }
}
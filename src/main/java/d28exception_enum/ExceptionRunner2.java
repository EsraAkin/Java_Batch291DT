package d28exception_enum;

public class ExceptionRunner2 {
    public static void main(String[] args) {


        numberOfStudents(-5);  //Bir okuldaki öğrenci sayısı negatif olanmaz

    }//main dışı
    public static void numberOfStudents(int sayi){
        if(sayi<0){
            throw new InvalidNumberException("Bir okuldaki öğrenci sayısı negatif olanmaz");
        }else{
            System.out.println(sayi);
        }
    }
}

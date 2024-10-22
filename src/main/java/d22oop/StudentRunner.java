package d22oop;

public class StudentRunner {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.getAge()); //13//*** Student.java clasına erişim sağladı oradaki age kullandı.
        //Yani artık aynı clastalar diyebiliriz.
        System.out.println(s.isSuccessful());  //true

        s.setAge(25); //Bunu direk yazdıramam.
        System.out.println(s.getAge()); //Böyle yazdırabilirim. //25



        s.setSuccessful(false);
        System.out.println(s.isSuccessful()); //false



        //ODEV: encapsulation da private ile gizlenen bir veri baska package’dan set method ile degistirilebilir mi?
    }
}

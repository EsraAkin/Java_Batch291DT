package d19stringbuilder_buffer_accessmodifier_static;

public class Student2Runner {
    public static void main(String[] args) {
        System.out.println("Student2.std "+Student2.stdName );

    Student2 ali=new Student2();  //age static olmadığı için obje üretip çağırmak zorundaydım.
        System.out.println("ali.age = " + ali.age);

        Student2.staticMethod();  //Ben statik bir methodum. Class ismiyle Direk ulaştım

        
        Student2 s=new Student2();  //Class ismiyle direk ulaşamam. Obje ürettim
        s.nonStaticMethod();  //Ben non-static bir methodum.
        //System.out.println("s = " + s);

    }
}

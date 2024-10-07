package d19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {

        //Studen Class'tan bir instance oluşturalım.
        Student ali=new Student();     //Student classtan bir obje ürettim.
        System.out.println(ali.stdName);
        System.out.println(ali.email);
        System.out.println(ali.address);
        // System.out.println(ali.tcKimlik);  // tcKimliğe başka clastan ulaşamaz
        //Çünkü private

       // System.out.println(ali);  //Student{stdName='Ali Can', address='Istanbul', email='alican@gmail.com', tcKimlik='12345678910'}

    }
}

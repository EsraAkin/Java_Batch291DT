package d28exception_enum;

public class ExceptionRunner {
    public static void main(String[] args) {

        studentGrade(55);


    }//main dışı

    public static void studentGrade(int not){
      //  System.out.println(not);

        if(not<0 || not>100){
           try{
               throw new InvalidStudentGradeException("Öğrenci notu 0'dan küçük veya 100'den büyük girilemez.");
           }catch (InvalidStudentGradeException e){
               e.printStackTrace();
           }

        }else{
            System.out.println(not);
        }

    }
}
/*Java'da final, finally ve finalize() terimleri farklı amaçlarla kullanılan üç farklı kavramı temsil eder.

	final:
    Değişkenler İçin: final keyword'uyle tanımlanan bir variable sadece bir kez değer alabilir.
    Bu, değişkenin değerinin sonradan değiştirilemeyeceği anlamına gelir. Yani, bu değişken sabittir (constant)

    Metotlar İçin: final keyword'uyle tanımlanan bir metot, child class'lar tarafından
    override edilemez.

    Class'lar İçin: final keyword'uyle tanımlanan bir class, genişletilemez (extends edilemez).
    Yani bu class'in child'i olmaz.

	finally:
    finally bloğu, try-catch yapısının bir parçasıdır. Bu blok, try bloğunda bir istisna oluşsa da
    oluşmasa da her zaman çalıştırılır.Genellikle kaynakların serbest bırakılması,
    dosyaların kapatılması gibi temizleme işlemleri için kullanılır.

	finalize():
    Bu, Object sınıfında tanımlanan bir metottur ve varsayılan olarak hiçbir işlem yapmaz.
    Bir nesne bellekten kaldırılmadan hemen önce Garbage Collector (Çöp Toplayıcı) tarafından
    otomatik olarak çağrılır. Genellikle dış kaynakların serbest bırakılması için kullanılır,
    ancak modern Java uygulamalarında kullanımı önerilmez.*/
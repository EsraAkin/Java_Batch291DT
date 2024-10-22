package d22oop;

public class ChildClass extends ParentClass{

    @Override
    public Integer multiple(Integer a, Integer b) {
        //Parent clasın çarpma metodunu  çağırdı.
       Integer sonuc=super.multiple(a, b);

       //Ek işlevsellik katalım.

        return sonuc+10;


    }
}

package d21oop;

public class Dog extends Mammal {

    public void bark() {
        System.out.println("Dogs bark...");
    }


    @Override//***bunu yazmak zorunda değilim. Ama bu metodun parentten alındığını belirtmiş oldum
    public void eat() {
        System.out.println("Dogs eat...");
    }



    @Override
    public Animal create() {
        return new Dog();  //Upcasting  // **Çocuk babanın datatipini kullanabilir

    }


    @Override
    public int add(int a, int b) {// ****int olmak zorunda. Parentte ne ise childde de aynı olmalı
        return a+b;
    }







}


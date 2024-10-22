package d21oop;

import d20staticblock_instanceblock_oop.Honda;

public class Car extends Vehicle {
    public static void main(String[] args) {
        Car c=new Car();
    }


    public String model="Accord";
    public int year=2024;

    public Car()//Parametresiz constructer oluşturdum.
    {
        this("Sport");
      //  super();
        System.out.println("Sedan");
    }

    public Car(String tip){//3 //***parametreli Constucter oluşturdum.
        super();
       System.out.println("Sport");
    }

}

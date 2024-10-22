package d21oop;

public class Honda extends Car {


    public String model="Civic";
    public int year=2023;

    public Honda()
    {
        System.out.println("super.model = " + super.model);//Parantının modeli
        System.out.println("this.year = " + this.year); //Kendi içindeki year

        // super(); //***En üste yaz superi yani buraya.Miras aldığı classa yani Car'a çağrı yapar.
        System.out.println("Civic");
    }

    public Honda(String model){//2
super("Sport");
        System.out.println("Accord");
    }

}

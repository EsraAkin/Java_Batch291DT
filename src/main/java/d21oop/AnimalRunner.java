package d21oop;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog d = new Dog();  //Dog clasından d objesi ürettim.  //***Dog clasta sadece bark vardı ama extends ile
        // parentinin de metotları kullandı.
        d.bark(); //Dogs bark...
        d.feedWithMilk();  //Mammals feed their babies wtih milk... //***Mammals feed their babies wtih milk...demesini istedim.
        //Bunu polimorfizm ile yaparım. //***yani Override
        d.drink(); //Animals drink....
        d.eat();   //Dogs eat...


        Bird b = new Bird();
        b.tweet(); //Birds tweet...
        b.eat(); // Animals eat ...


        Cat c = new Cat();
        c.feedWithMilk(); // Cat feed their babies wtih milk...


    }
}

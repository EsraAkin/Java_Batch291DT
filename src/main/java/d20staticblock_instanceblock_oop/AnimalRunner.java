package d20staticblock_instanceblock_oop;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog d=new Dog();  //Dog clasından d objesi ürettim.  //***Dog clasta sadece bark vardı ama extends ile
        // parentinin de metotları kullandı.
        d.bark(); //Dogs bark...
        d.feedWithMilk();  //Mammals feed their babies wtih milk...
        d.drink(); //Animals drink....



        Bird b=new Bird();
        b.tweet() ; //Birds tweet...
        b.eat(); // Animals eat ...

    }
}

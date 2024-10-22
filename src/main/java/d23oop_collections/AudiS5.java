package d23oop_collections;

public class AudiS5 implements Engine, AC, Brake{
    @Override
    public void eco() {

        System.out.println("Audi AudiS5 ekonomik motor kullanır. ");
    }

    @Override
    public void turbo() {

        System.out.println("Audi AudiS5 turbo motor kullanır. ");
    }

    @Override
    public void gas() {

        System.out.println("Audi AudiS5 benzinli motor kullanır. ");
    }

    //AC interface’inden override edilenler


    @Override
    public void analog() {
        System.out.println("Audi AudiS5 analog klima kullanır. ");
    }

    @Override//Override yazmak zorunda değilim
    public void digital() {
        System.out.println("Audi AudiS5 digital klima kullanır. ");
    }

    //Brake interface’inden override edilenler


    @Override
    public void abs() {
        System.out.println("Audi AudiS5 abs fren sistemi kullanır. ");
    }

    @Override
    public void esp() {
        System.out.println("Audi AudiS5 esp fren sistemi kullanır. ");
    }

    @Override         //parent olan 3 interface de var.
    public void run() {
        System.out.println("Audi S5 hava yastığı çalıştırır. ");

    }

}

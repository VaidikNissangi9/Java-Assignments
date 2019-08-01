package Assignment7;

class Cycle{

}
class UniCycle extends Cycle{
    UniCycle(){
        System.out.println("It's Unicycle");
    }
    public void balance(){
        System.out.println("Balancing unicycle");

    }
}
class BiCycle extends Cycle{
    BiCycle(){
        System.out.println("It's Bicycle");
    }
    public void balance(){
        System.out.println("Balancing bicycle");

    }
}
class TriCycle extends Cycle{
    TriCycle(){
        System.out.println("It's Tricycle");
    }

}
public class Cycles {
    public static void main(String args[]){
        Cycle cycles[]={new UniCycle(),new BiCycle(),new TriCycle()};

       /* for(Assignment7.Cycle cycle:cycles)
            cycle.balance();*/ //Since there is no balance() method in base class we cannot call
        ((UniCycle)cycles[0]).balance();
        ((UniCycle)cycles[1]).balance();

    }
}

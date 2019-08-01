package Assignment7;

abstract class Rodent {
    public abstract void color();

}
 class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("In Assignment7.Gerbil class");
    }
    @Override
     public void color(){
        System.out.println("The color of gerbil is red");
    }
}
class Hamster extends Rodent{
    Hamster(){
        System.out.println("In Assignment7.Hamster class");
    }
    @Override
    public void color(){
        System.out.println("The color of hamster is white");
    }
}
public class Hierarchy{
    public static void main(String args[]){
        Gerbil gerbil =new Gerbil();
        Hamster hamster=new Hamster();

        Rodent rodent[]={gerbil,hamster};
        for(Rodent rodents:rodent)
            rodents.color();

    }
}


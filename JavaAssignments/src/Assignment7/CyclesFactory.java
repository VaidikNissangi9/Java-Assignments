package Assignment7;

interface Cycle1{
    void type();
}
class UniCycle1 implements  Cycle1{
    UniCycle1(){
        System.out.println("Unicycle ordered");
    }
    @Override
    public void type(){
        System.out.println("Unicycle type");
    }


}
class BiCycle1 implements  Cycle1{
    BiCycle1(){
        System.out.println("Bicycle ordered");
    }
    @Override
    public void type(){
        System.out.println("Bicycle type");
    }

}
class TriCycle1 implements  Cycle1{
    TriCycle1(){
        System.out.println("Tricycle ordered");
    }
    @Override
    public void type(){
        System.out.println("Tricycle type");
    }


}
class UniCycleFactory {
    public static UniCycle1 getUnicycle()
    { return new UniCycle1();}
}
class BiCycleFactory {
    public static BiCycle1 getBicycle()
    { return new BiCycle1();}
}
class TriCycleFactory {
    public static TriCycle1 getTricycle()
    { return new TriCycle1();}
}
public class CyclesFactory {
    public static void main(String args[]){
    Cycle1 uni=UniCycleFactory.getUnicycle();
    Cycle1 bi=BiCycleFactory.getBicycle();
    Cycle1 tri=TriCycleFactory.getTricycle();}


}

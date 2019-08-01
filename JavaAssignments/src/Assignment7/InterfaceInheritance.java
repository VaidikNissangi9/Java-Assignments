package Assignment7;

interface Brands{
    void wrogn();
    void uspa();
}
interface Types{
    void fullSleeves();
    void halfSleeves();
}
interface Items{
    void shirts();
    void tShirts();
}
interface Fashion extends Brands,Types,Items{
    void clothing();
}
class Shopping {
    Shopping(){
        System.out.println("Started Assignment7.Shopping");
    }
}
public class InterfaceInheritance extends Shopping implements Fashion{
    public void wrogn(){System.out.println("Selected wrogn brand");

    }
    public void uspa(){System.out.println("Selected uspa ");

    }

    @Override
    public void fullSleeves() {System.out.println("Selected full sleeves");

    }

    @Override
    public void halfSleeves() {System.out.println("Selected half sleeves");

    }

    @Override
    public void shirts() {
        System.out.println("Selected shirts");

    }

    @Override
    public void tShirts() {
        System.out.println("Selected tshirts");

    }

    @Override
    public void clothing() {
        System.out.println("Selected clothing");

    }
    public void brand(Brands brands){
        brands.uspa();
        brands.wrogn();

    }
    public void type(Types types){types.fullSleeves();
    types.halfSleeves();

    }
    public void item(Items items){
        items.shirts();
        items.tShirts();

    }
    public void fashion(Fashion fashion)
    {fashion.clothing();

    }
    public static void main(String args[]){
        InterfaceInheritance shop =new InterfaceInheritance();
        shop.brand(shop);
        shop.item(shop);
        shop.type(shop);
        shop.fashion(shop);
    }
}

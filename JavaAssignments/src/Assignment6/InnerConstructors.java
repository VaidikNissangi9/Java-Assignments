package Assignment6;

public class InnerConstructors {

    InnerConstructors(String brand,String item){this("full sleeves",1000);
        System.out.println("The brand chosen is "+brand+" and the item is "+item);

    }
    InnerConstructors(String type,float cost){
        System.out.println("The type of clothing is "+type+" which costs Rs."+cost);
    }
    public static void main(String args[]){
        InnerConstructors overload=new InnerConstructors("Wrogn","Shirt");
    }
}

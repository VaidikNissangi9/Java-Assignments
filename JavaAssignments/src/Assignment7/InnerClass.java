package Assignment7;

class Brand{
    class Wrogn{
        Wrogn(String type){

        }
    }
}
class Type{
    class Shirt extends Brand.Wrogn{
        Shirt( Brand brand){
            brand.super("wrogn");

        }
    }
}


public class InnerClass {
    public static void main(String args[]){
        Brand brand= new Brand();
        Type type=new Type();
        Type.Shirt shirt = type.new Shirt(brand);
    }
}

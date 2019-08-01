public class Singleton {
    String var;
    public static Singleton method(String string){
            /*var="The Lion King";*/
        // Non static variable cannot be initiaized inside static method.

            return new Singleton();
        }
        public void print(){
        System.out.println(var);


    }
}

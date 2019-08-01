package Assignment8;

class Lesser_Exception extends Exception{};
class Greater_Exception extends Exception{};
class Password_Exception extends Exception{};



public class ExceptionHandler {
    static int len=10,min_len=8;
    public  void check(int phoneNumber,String password) throws Lesser_Exception,Greater_Exception,Password_Exception{
        String phone=""+phoneNumber;
        if(phone.length()<len){
            System.out.println("phone number is less than 10 digits");
            throw new Lesser_Exception();
        }
        if(phone.length()>len){ System.out.println("phone number is greater than 10 digits");
            throw new Greater_Exception();}
        if(password.length()<min_len){ System.out.println("password is less than min length");
            throw new Password_Exception();}
        if(password.isEmpty()){ System.out.println("password is empty");
            throw new NullPointerException();}







    }
    public static void main(String args[]){
        ExceptionHandler exception=new ExceptionHandler();


        try{
            exception.check(999999999,"Zemoso1");
        }
        catch (Exception e){
            System.out.println("There is an exception");
        }
        finally{
            System.out.println("finally called");
        }
    }
}

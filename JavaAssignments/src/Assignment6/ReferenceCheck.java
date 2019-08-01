package Assignment6;

public class ReferenceCheck {
    ReferenceCheck(String type){
        System.out.println("The type is "+type);
    }
    public static void main(String args[]){
        ReferenceCheck referenceCheck[]=new ReferenceCheck[5];

        for(ReferenceCheck reference:referenceCheck)
            System.out.println(reference);
        //Since there are ony reference variables but no objects,it prints null
        //Exercise 4
        ReferenceCheck referenceCheck1[]={new ReferenceCheck("shirts"),new ReferenceCheck("tshirts")};
        for(ReferenceCheck reference:referenceCheck1)
            System.out.println(reference);

    }
}

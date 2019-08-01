package Assignment6;

import java.util.ArrayList;
import java.util.Arrays;

public class VampireNumber {
    //this method is used for checking if the number is vampire number
    public static boolean check(long number,long factor1,long factor2){
        if(factor1%10==0 && factor2%10==0)
            return false;
        if(Long.toString(factor1).length()!=Long.toString(number).length()/2 || Long.toString(factor2).length()!=Long.toString(number).length()/2)
            return false;
       char numList[]= (""+number).toCharArray();
       char factorsList[]=(""+factor1+factor2).toCharArray();
        Arrays.sort(factorsList);
        Arrays.sort(numList);

       return Arrays.equals(factorsList,numList);




    }
    public static void main(String args[]){
        ArrayList<Long> list=new ArrayList<>();
       for(long i=10;list.size()<100;i++){
             if(((""+i).length()%2)==0){


                 for(long factor1 = (long) Math.pow(10,(""+i).length()/2-1); factor1<=Math.sqrt(i)+1; factor1++){
                     if(i%factor1==0)
                     {
                         long factor2=i/factor1;
                         if(check(i,factor1,factor2)){
                             list.add(i);}
                     }
                 }
             }}


        System.out.println(list);


    }
}

package Assignment2;


public class AlphabetCheck {
    // this method checks if the input contains all the alphabets
    public boolean check(String input){
        boolean alpha[]=new boolean[26];
        for(int i=0;i<alpha.length;i++)
            alpha[i]=false;

        int index=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>='A'&& input.charAt(i)<='Z')
                index=input.charAt(i)-'A';
            else {if(input.charAt(i)>='a' && input.charAt(i)<='z')
            { index=input.charAt(i)-'a';}}
            alpha[index]=true;
        }
        for(int i=0;i<=25;i++){
            if(alpha[i]==false)
                return false;
        }return true;
    }public static void main(String args[]){
        AlphabetCheck assign= new AlphabetCheck();
        System.out.println( "Contains all alphabets:"+ assign.check("abcdefghijklmnopqrstuvwxz"));
    }
    //Time complexity of the program is O(n) .As only 2 for loops are used which are separate
    //Space complexity is also the same as only the array of input string is used

}

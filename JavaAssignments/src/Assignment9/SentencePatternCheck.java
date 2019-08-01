package Assignment9;

import java.util.regex.*;
public class SentencePatternCheck {
    public boolean test(String input){
        return Pattern.matches("[A-Z].*\\.",input);

    }
    public static void main(String args[]){
        SentencePatternCheck assign= new SentencePatternCheck();
       System.out.println( assign.test("Here where the sky is falling."));
    }
}

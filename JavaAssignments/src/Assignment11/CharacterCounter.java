package Assignment11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String args[]){



       try{
           String filename="src/"+args[0];//takes input from command line
        BufferedReader reader= new BufferedReader(new FileReader(filename));
        String line;
        Map<Character,Integer> count = new HashMap<>();
        while((line=reader.readLine())!=null){
            char charArray[]=line.toCharArray();
            for(int i=0;i<charArray.length;i++){
                if(charArray[i]!=' '){
                if(count.containsKey(charArray[i]))
                    count.put(charArray[i],count.get(charArray[i])+1);
                else
                    count.put(charArray[i],1);}
            }

        }
           FileWriter out =new FileWriter("./out.txt");
           for(Map.Entry entry:count.entrySet())
               out.write(entry.getKey()+" "+entry.getValue()+"\n");
           out.close();
           System.out.println("Count is in out file");
       }
       catch(Exception e){
           System.out.println(e.getMessage());

       }
    }
}

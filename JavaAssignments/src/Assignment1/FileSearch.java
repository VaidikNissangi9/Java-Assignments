package Assignment1;

import java.io.File;
import java.util.Scanner;

public class FileSearch
    {
        /**
         *This method is used to search all the files matching the regex given.
         * @param dir
         * @param regex
         */
        public  void search(File dir,String regex){

            File files[]=dir.listFiles();
            for(File file:files){
                if(file.isDirectory())
                    search(new File(file.getPath()),regex);//searches for files ,if it is a directory
                else if(file.isFile())
                {
                    if(file.getName().matches(regex))
                        System.out.println(file.getAbsolutePath());
                }

            }


        }
        public static void main(String args[]){
            FileSearch file=new FileSearch();
            String stop="stop";//enter this to break
            while(true){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the regex:");
            String regex=scan.nextLine();
            if(regex.matches(stop))
                    break;
            File dir= new File("/home/");file.search(dir,regex);

            }

        }
    }

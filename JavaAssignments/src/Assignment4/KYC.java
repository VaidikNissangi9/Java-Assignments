package Assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class

KYC {
    /**
     * this method finds the starting and ending date range for update of kyc form
     * @param signUp
     * @param presentDate
     */
    public static void range(String signUp,String presentDate){
        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate signUpDate= LocalDate.parse(signUp,format);
        LocalDate currentDate=LocalDate.parse(presentDate,format);
        LocalDate anniversaryDate=LocalDate.of(currentDate.getYear(),signUpDate.getMonth(),signUpDate.getDayOfMonth());
        LocalDate startRange=anniversaryDate.minusDays(30);
        LocalDate endRange=anniversaryDate.plusDays(30);
        if(currentDate.getYear()<=signUpDate.getYear())
            System.out.println("No range");
        if(startRange.isBefore(currentDate)){
            if(endRange.isAfter(currentDate))
                System.out.println(startRange.format(format)+" "+endRange.format(format));
            else
                System.out.println(startRange.format(format)+" "+currentDate.format(format));
        }
        else{
            anniversaryDate=anniversaryDate.minusYears(1);
            if(anniversaryDate.equals(currentDate))
            {    System.out.println("No range"); return;}
            startRange=anniversaryDate.minusDays(30);
            endRange=anniversaryDate.plusDays(30);
            if(endRange.isAfter(currentDate))
                System.out.println(startRange.format(format)+" "+currentDate.format(format));
            else
                System.out.println(startRange.format(format)+" "+endRange.format(format));

        }




    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        List<String> signUpdates=new ArrayList<>();
        List<String> curdates=new ArrayList<>();
        for(int i=0;i<n;i++){
            signUpdates.add(scan.next()); curdates.add(scan.next());
        }
        for(int i=0;i<n;i++)
            range(signUpdates.get(i),curdates.get(i));
    }
}

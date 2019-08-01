package Assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PIngTest {
    public static void main(String[] args) {
        System.out.println("enter the host:");
        Scanner sc =new Scanner(System.in);
        String ip=sc.nextLine();
        //command for using ping
        String pingCmd = "ping -c 5 " + ip;
        try {
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(pingCmd);

            List <Float> time= new ArrayList<>();

            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                if(inputLine.contains("64 bytes"))
                    time.add(Float.parseFloat(inputLine.substring(inputLine.lastIndexOf("=")+1,inputLine.length()-3)));
                System.out.println(inputLine);

            }
            Collections.sort(time);
            System.out.println("Median of time taken to ping the host:"+time.get(2));
            in.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }}

package ride;/*
ID: sumin0108
LANG: JAVA
TASK: ride.ride
*/

import java.io.*;
import java.util.*;

public class ride  {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("ride.ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.ride.out")));
        StringTokenizer comet = new StringTokenizer(f.readLine());
        StringTokenizer group = new StringTokenizer(f.readLine());
        String c = comet.nextToken();
        String g = group.nextToken();
        int cNum=1, gNum=1;
        for(int i=0; i<c.length(); i++){
            char ch = c.charAt(i);
            cNum*=(int)ch - 64;
        }
        for(int i=0; i<g.length(); i++){
            char ch = g.charAt(i);
            gNum*=(int)ch - 64;
        }
        cNum = cNum % 47;
        gNum = gNum % 47;

        if(cNum==gNum){
            out.println("GO");
        }else{
            out.println("STAY");
        }
        out.close();
    }
}


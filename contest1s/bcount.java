package contest1s;/*
ID: sumin0108
LANG: JAVA
TASK: bount
*/

import java.io.*;
import java.util.*;

public class bcount {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("contest1s.bcount.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("contest1s.bcount.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int c1=0, c2=0, c3=0;
        int[] c = new int[n];

        int[] cow1 = new int[n];
        int[] cow2 = new int[n];
        int[] cow3 = new int[n];

        //Get the type of cows inside int array c, (1 is cow breed 1, etc.)
        for (int i = 0; i < n; i++) {
            int in = Integer.parseInt(f.readLine());
//            c[i] = in;
            if(i==0){
                cow1[i] = 0;
                cow2[i] = 0;
                cow3[i] = 0;

            }else{
                cow1[i] = cow1[i-1];
                cow2[i] = cow2[i-1];
                cow3[i] = cow3[i-1];
            }

            if(in==1){
                cow1[i]++;
            } else if(in==2){
                cow2[i]++;
            } else if(in==3){
                cow3[i]++;
            }
        }

        //Loop through the queries
        for (int i = 0; i < q; i++) {
            c1=0;
            c2=0;
            c3=0;
            st = new StringTokenizer(f.readLine());
            //A is first number read from input
            int a = Integer.parseInt(st.nextToken());
            //B is second number read from input
            int b = Integer.parseInt(st.nextToken());

            int aindex = 0;
            if(a==1){
                c1 = cow1[b - 1];
                c2 = cow2[b - 1];
                c3 = cow3[b - 1];
            }
            else {
                c1 = cow1[b - 1] - cow1[a-2];
                c2 = cow2[b - 1] - cow2[a-2];
                c3 = cow3[b - 1] - cow3[a-2];
            }
            out.println(c1 + " " + c2 + " " + c3);
            System.out.println(c1+ " " + c2 + " " + c3);
        }
        out.close();
    }
}

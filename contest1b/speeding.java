package contest1b;/*
ID: sumin0108
LANG: JAVA
TASK: contest1b.speeding
*/

import java.io.*;
import java.util.*;
public class speeding {
    public static void main (String [] args) throws IOException {
        int diff=0;
        int ans = 0;
        BufferedReader f = new BufferedReader(new FileReader("contest1b.speeding.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("contest1b.speeding.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int i1 = Integer.parseInt(st.nextToken());
        int i2 = Integer.parseInt(st.nextToken());

        int[] of1 = new int[i1];
        int[] os1 = new int[i2];

        int[] f1 = new int[i1];
        int[] f2 = new int[i1];
        int[] s1 = new int[i2];
        int[] s2 = new int[i2];


        for (int i = 0; i < i1; i++) {
            int p=0;
            st = new StringTokenizer(f.readLine());
            int t1 = Integer.parseInt(st.nextToken());
            int t2 = Integer.parseInt(st.nextToken());
            of1[i] = t1;
            f2[i] = t2;
        }
        for (int i = 0; i < f1.length; i++) {
            if(i==0){
                f1[i] = of1[i];
            }else {
                f1[i] = of1[i] + f1[i - 1];
            }
        }
        for (int i = 0; i < i2; i++) {
            st = new StringTokenizer(f.readLine());
            int t1 = Integer.parseInt(st.nextToken());
            int t2 = Integer.parseInt(st.nextToken());
            os1[i] = t1;
            s2[i] = t2;
        }
        for (int i = 0; i < s1.length; i++) {
            if(i==0){
                s1[i] = os1[i];
            }else {
                s1[i] = os1[i] + s1[i - 1];
            }
        }

        for (int i = 0; i < f1.length; i++) {
            int a = f1[i];
            for (int k = 0; k < s1.length; k++) {
                if((s1[k]>=a) && ((k==0)||(s1[k-1]<a))){
                    if(f2[i] < s2[k]){
                        System.out.println("Here: at " + f1[i] + " nums: "+ f2[i] + ", " + s2[k]);
                        diff = s2[k] - f2[i];
                        if(diff>ans) ans=diff;
                    }
                }
            }
        }

        for (int i = 0; i < s1.length; i++) {
            int a = s1[i];
            for (int k = 0; k < f1.length; k++) {
                if((f1[k]>=a) && ((k==0)||(f1[k-1]<a))){
                    if(s2[i] > f2[k]){
                        diff = s2[i] - f2[k];
                        System.out.println("Here: at " + s1[i] + " f1[k] = " + s2[i]+ " diff: "+ diff);
                        if(diff>ans) ans=diff;
                    }
                }
            }
        }

        System.out.println(ans);
        out.println(ans);
        out.close();









//        for (int i = 0; i < f2.length; i++) {
//            System.out.println(f2[i]);
//        }

    }
}

package contest1s;/*
ID: sumin0108
LANG: JAVA
TASK: contest1s.highcard
*/


import java.io.*;
import java.util.*;

public class highcard {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("contest1s.highcard.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("contest1s.highcard.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());

        int n = Integer.parseInt(st.nextToken());
        int match = 0;
        int bCount = 0;
        int points = 0;
        int[] e = new int[n];
        int[] b = new int[n];
        int[] all = new int[2 * n];

        boolean[] ee = new boolean[2 * n + 1];

        //get all
        for (int i = 0; i < 2 * n; i++) {
            all[i] = i+1;
        }

        //put elsie stuff to e
        for (int i = 0; i < n; i++) {
            e[i] = Integer.parseInt(f.readLine());
            ee[e[i]] = true;
        }

        for (int i = 0; i < all.length; i++) {
            if(!ee[all[i]]){
                b[bCount] = all[i];
                bCount++;
            }
        }

        for (int i = 0; i < e.length; i++) {
            match=0;
            for (int k = 0; k < b.length; k++) {
                if(b[k] > e[i]){
                    points++;
                    b[k] = -1;
                    match = 1;
                    break;
                }
            }
            if(match==0){
                for (int k = 0; k < b.length; k++) {
                    if(b[k]!=-1){
                        b[k] = 1;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < b.length; i++) {
        }
        System.out.println(points);
        out.println(points);
        out.close();
    }
}

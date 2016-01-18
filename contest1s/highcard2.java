package contest1s;/*
ID: sumin0108
LANG: JAVA
TASK: contest1s.highcard
*/


import java.io.*;
import java.util.*;

public class highcard2 {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("contest1s.highcard.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("contest1s.highcard.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());

        int n = Integer.parseInt(st.nextToken());
        int match = 0;
        int kCount = 0;
        int points =0;
        int[] e = new int[n];

        for (int i = 0; i < n; i++) {
            e[i] = Integer.parseInt(f.readLine());
        }

        for (int i = 0; i < e.length; i++) {
            for (int k = kCount; k < n; k++) {
                if((k)>e[i]){
                    for (int j = 0; j < e.length; j++) {
                        match=0;
                        if (k == e[j]) {
                            match = 1;
                            break;
                        }
                    }
                    if(match==0) {
                        points++;
                        kCount++;
                    }

                }
                if(e[k]==k){
                    match=1;
                    break;
                }
            }


            }
//            if(match==0){
//                for (int k = 0; k < b.length; k++) {
//                    if(b[k]!=-1){
//                        b[k] = 1;
//                        break;
//                    }
//                }
//            }
//        }


        System.out.println(points);
        out.println(points);
        out.close();
    }
}

package contest1b;/*
ID: sumin0108
LANG: JAVA
TASK: SubmittingSolutions.test
*/

import java.io.*;
import java.util.*;


public class badmilk {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("contest1b.badmilk.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("contest1b.badmilk.out")));
        StringTokenizer input = new StringTokenizer(f.readLine());

        int people = Integer.parseInt(input.nextToken());
        int milk = Integer.parseInt(input.nextToken());
        int d = Integer.parseInt(input.nextToken());
        int s = Integer.parseInt(input.nextToken());
        int ans = 0;

        int[] sp = new int[s];
        int[] st = new int[s];
        int[] dp = new int[d];
        int[] dm = new int[d];
        int[] dt = new int[d];
        int[] tm = new int[milk];
        int[] m = new int[milk];
        int[] sickp = new int[people];

        Arrays.fill(tm, 0);
        Arrays.fill(m, 1);
        Arrays.fill(sickp, 0);

        for (int i = 0; i < d; i++) {
            input = new StringTokenizer(f.readLine());
            dp[i] = Integer.parseInt(input.nextToken());
            dm[i] = Integer.parseInt(input.nextToken());
            dt[i] = Integer.parseInt(input.nextToken());
        }
        for (int i = 0; i < s; i++) {
            input = new StringTokenizer(f.readLine());
            sp[i] = Integer.parseInt(input.nextToken());
            st[i] = Integer.parseInt(input.nextToken());
        }

        for (int i = 0; i < sp.length; i++) {
//            tmCount = 0;
            Arrays.fill(tm, 0);
            for (int k = 0; k < dp.length; k++) {
                if(sp[i] == dp[k]){
                    if(dt[k]<st[i]) {
//                        tm[tmCount] = dm[k];
                        tm[dm[k]-1] = 1;
                        System.out.println(dm[k] + " just turned to 1");
                    }
                }
            }
            for (int j = 0; j < m.length; j++) {
                if(tm[j] == 0){
                    m[j] = 0;
                }
            }
        }

        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }

        for (int i = 0; i < m.length; i++) {
            System.out.println();
            if(m[i] == 1){
                for (int k = 0; k < dm.length; k++) {
                    if(dm[k]==i+1){
                        sickp[dp[k]-1] = 1;
                        System.out.println(dp[k] + " is sick");
                    }
                }
            }
        }

        for (int i = 0; i < sickp.length; i++) {
            if(sickp[i] == 1){
                ans++;
            }
        }

        System.out.println("ans is " + ans);
        out.println(ans);
        out.close();

    }
}

package contest1b;/*
ID: sumin0108
LANG: JAVA
TASK: contest1b.paint
*/

import java.io.*;
import java.util.*;


public class paint {
    public static void main (String [] args) throws IOException {
        int ans = 0;
        BufferedReader f = new BufferedReader(new FileReader("contest1b.paint.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("contest1b.paint.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(f.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int first = (b - a);
        int second = d - c;

        if(b<=c){
            ans = first + second;
            //b=d?
            System.out.println("b<=c");
        }
        else if(b>c && b<=d){
            if(a<c){
                ans = d-a;
            } else if(a>=c){
                ans = second;
            }
            System.out.println("b>c && b<=d");
        }
        else if(b>d){
            if(a>=d){
                ans = first + second;
            } else if(a>=c && a<d){
                ans = b-c;
            } else if(a<c){
                ans = b-a;
            }
            System.out.println("b>d");
        }
        System.out.println(ans);
//        System.out.println(a + " " + b + " " + c + " " + d);
        out.println(ans);
        out.close();
    }
}

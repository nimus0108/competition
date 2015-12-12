package gift; /**
 * Created by sumin1 on 12/10/15.
 */
/*
ID: sumin0108
LANG: JAVA
TASK: gift.gift1
*/

import java.io.*;
import java.util.*;


public class gift1 {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("gift.gift1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift.gift1.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int np = Integer.parseInt(st.nextToken());
        int place=0, place2=0;

        //get np
        String[][] l = new String[np][2];

        //init num vals in l
        for(int ok=0; ok<np; ok++){
            l[ok][1] = "0";
        }

        //store names in l
        for(int i=0; i<np; i++){
            l[i][0] = f.readLine();
        }

        for(int i=0; i<np; i++) {
            //get the name
            String name = f.readLine();
            System.out.println("\nNAME: " + name);
            //find the name in l, store the place of the name in place
            for(int j=0; j<np; j++){
                if(name.equals(l[j][0])) {
                    place = j;
                    break;
                }
            }

            StringTokenizer second = new StringTokenizer(f.readLine());
            //get two ints
            int m = Integer.parseInt(second.nextToken());
            int p = Integer.parseInt(second.nextToken());
            if(p!=0) {
                //Calculate how much to give each person
                int costForGiver = m - (m % p);

                //Remainder of money goes to giver
//                int currentMoney = Integer.parseInt(l[place][1]);
                if(l[place][1].equals("0")){
                    l[place][1] = Integer.toString(0 - (costForGiver));
                } else{
                    int currentMoney = Integer.parseInt(l[place][1]);
                    l[place][1] = Integer.toString(currentMoney-costForGiver);
                }

                System.out.println("this for recipient:" + l[place][1]);
                m = costForGiver / p;



                //get the names that are receiving the gifts
                for (int k = 0; k < p; k++) {
                    String tname = f.readLine();
                    //Find place of recipient
                    for (int j = 0; j < np; j++) {
                        if (tname.equals(l[j][0])) {
                            place2 = j;
                            break;
                        }

                    }
                    int currentMoney = Integer.parseInt(l[place2][1]);
                    System.out.println(tname + " gets " + m);
                    l[place2][1] = Integer.toString(m + currentMoney);
                    System.out.println(l[place2][0] + " got " + l[place2][1]);
                }
            }
        }


        for(int i=0; i<np; i++){
            System.out.println(l[i][0] + " " + l[i][1]);
            out.println((l[i][0] + " " + l[i][1]));
        }

        out.close();
    }
}

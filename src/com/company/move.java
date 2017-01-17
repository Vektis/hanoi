package com.company;
import java.lang.Math;
import java.util.*;
/**
 * Created by vr834 on 1/17/17.
 */
public class move {
    public move(){

    }
    public static void disc(int n){
        int minmoves = (int)(Math.pow(2,n) - 1);
        int [] dir = new int[minmoves];
        //System.out.println("wew");
        int [] []disks = new int[n][3];
        //System.out.println("lad");
        for (int i = n-1 ; i > 0 ; i--) {
            disks[i][0] = i + 1;
        }
        disks[0][0] = 1;
        //System.out.println("ok");
        //Arrays.sort(disks);
        for(int []i :disks){
            System.out.println(Arrays.toString(i));
        }
      //  for(int i:disks[0])
        //    System.out.println(i);
        /*
        For an even number of disks:
make the legal move between pegs A and B (in either direction)
make the legal move between pegs A and C (in either direction)
make the legal move between pegs B and C (in either direction)
repeat until complete
         */
        int i = 0;
        if (n % 2 == 0) {
            while(true){
                if(i >= minmoves){
                }
                // a to b or b to a
               if(disks[2][0])
                i++;
            }
        }

        /*
        For an odd number of disks:

make the legal move between pegs A and C (in either direction)
make the legal move between pegs A and B (in either direction)
make the legal move between pegs C and B (in either direction)
repeat until complete
         */
        else{

        }
        //return dir;
    }
}

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
        //int [] dir = new int[minmoves];
        int [] c1 = new int[n];
        int [] c2 = new int[n];
        int [] c3 = new int[n];
        int x = 0;
        for (int i = 1; i <= n; i++) {
            c1[i-1] = i;
        }
        if(n % 2 == 0){
            System.out.println(" ");
            System.out.println("C1:");

            for(int i :  c1){
                System.out.print(i + ",");
            }
            System.out.println(" ");
            System.out.println("C2:");

            for(int i :  c2){
                System.out.print(i + ",");
            }
            System.out.println(" ");
            System.out.println("C3:");
            for(int i : c3){
                System.out.print(i+",");
            }
            while(true){

                int s1c = 0;
                int s1c2 = 0;
                for (int i = 0; i < c1.length; i++) {
                    if(c1[i] != 0){
                        s1c = c1[i];
                        break;
                    }
                }
                for (int i = 0; i < c2.length; i++) {
                    if(c2[i] != 0){
                        s1c2 = c2[i];
                        break;
                    }
                }
                System.out.println(" ");
                if ((s1c < s1c2 || s1c2 == 0) && s1c != 0){
                    System.out.println("Move a disk from the 1st to 2nd");
                    for (int i = 0; i < c1.length; i++) {
                        if(c1[i] != 0){
                            c2[0] = c1[i];
                            c1[i] = 0;
                            Arrays.sort(c2);
                            break;
                        }
                    }
                }
                else{
                    System.out.println("Move a disk from the 2nd to 1st");
                    for (int i = 0; i < c2.length; i++) {
                        if(c2[i] != 0){
                            c1[0] = c2[i];
                            c2[i] = 0;
                            Arrays.sort(c1);
                            break;
                        }
                    }
                }
                System.out.println(" ");
                System.out.println("C1:");

                for(int i :  c1){
                    System.out.print(i + ",");
                }
                System.out.println(" ");
                System.out.println("C2:");

                for(int i :  c2){
                    System.out.print(i + ",");
                }
                System.out.println(" ");
                System.out.println("C3:");
                for(int i : c3){
                    System.out.print(i+",");
                }
                x++;
                if(x == minmoves){
                    System.exit(0);
                }
                //pt2
                int s2c = 0;
                int s2c2 = 0;
                for (int i = 0; i < c1.length; i++) {
                    if(c1[i] != 0){

                        s2c = c1[i];
                        break;
                    }
                }
                for (int i = 0; i < c3.length; i++) {
                    if(c3[i] != 0){
                        s2c2 = c3[i];
                        break;
                    }
                }
                System.out.println(" ");
                if ((s2c < s2c2 || s2c2 == 0) && s2c != 0){
                    System.out.println("Move a disk from the 1st to 3rd");
                    for (int i = 0; i < c1.length; i++) {
                        if(c1[i] != 0){
                            c3[0] = c1[i];
                            c1[i] = 0;
                            Arrays.sort(c3);
                            break;
                        }
                    }
                }
                else{
                    System.out.println("Move a disk from the 3rd to 1st");
                    for (int i = 0; i < c3.length; i++) {
                        if(c3[i] != 0){
                            c1[0] = c3[i];
                            c3[i] = 0;
                            Arrays.sort(c1);
                            break;
                        }
                    }
                }
                System.out.println("C1:");

                for(int i :  c1){
                    System.out.print(i + ",");
                }
                System.out.println(" ");
                System.out.println("C2:");

                for(int i :  c2){
                    System.out.print(i + ",");
                }
                System.out.println(" ");
                System.out.println("C3:");
                for(int i : c3){
                    System.out.print(i+",");
                }
                x++;
                if(x == minmoves){
                    System.exit(0);
                }
                //pt3
                int s3c = 0;
                int s3c2 = 0;
                for (int i = 0; i < c2.length; i++) {
                    if(c2[i] != 0){

                        s3c = c2[i];
                        break;
                    }
                }
                for (int i = 0; i < c3.length; i++) {
                    if(c3[i] != 0){
                        s3c2 = c3[i];
                        break;
                    }
                }
                System.out.println(" ");
                if ((s3c < s3c2 || s3c2 == 0 )&& s3c != 0){
                    System.out.println("Move a disk from the 2nd to 3rd");
                    for (int i = 0; i < c2.length; i++) {
                        if(c2[i] != 0){
                            c3[0] = c2[i];
                            c2[i] = 0;
                            Arrays.sort(c3);
                            break;
                        }
                    }
                }
                else{
                    System.out.println("Move a disk from the 3rd to 2nd");
                    for (int i = 0; i < c3.length; i++) {
                        if(c3[i] != 0){
                            c2[0] = c3[i];
                            c3[i] = 0;
                            Arrays.sort(c2);
                            break;
                        }
                    }
                }
                System.out.println(" ");
                System.out.println("C1:");

                for(int i :  c1){
                    System.out.print(i + ",");
                }
                System.out.println(" ");
                System.out.println("C2:");

                for(int i :  c2){
                    System.out.print(i + ",");
                }
                System.out.println(" ");
                System.out.println("C3:");
                for(int i : c3){
                    System.out.print(i+",");
                }
                x++;
                if(x == minmoves){
                    System.exit(0);
                }



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
            System.out.println(" ");
            System.out.println("C1:");

            for(int i :  c1){
                System.out.print(i + ",");
            }
            System.out.println(" ");
            System.out.println("C2:");

            for(int i :  c2){
                System.out.print(i + ",");
            }
            System.out.println(" ");
            System.out.println("C3:");
            for(int i : c3){
                System.out.print(i+",");
            }
            while(true){

                int s1c = 0;
                int s1c2 = 0;
                for (int i = 0; i < c1.length; i++) {
                    if(c1[i] != 0){
                        s1c = c1[i];
                        break;
                    }
                }
                for (int i = 0; i < c3.length; i++) {
                    if(c3[i] != 0){
                        s1c2 = c3[i];
                        break;
                    }
                }
                System.out.println(" ");
                if ((s1c < s1c2 || s1c2 == 0) && s1c != 0){
                    System.out.println("Move a disk from the 1st to 3rd");
                    for (int i = 0; i < c1.length; i++) {
                        if(c1[i] != 0){
                            c3[0] = c1[i];
                            c1[i] = 0;
                            Arrays.sort(c3);
                            break;
                        }
                    }
                }
                else{
                    System.out.println("Move a disk from the 3rd to 1st");
                    for (int i = 0; i < c3.length; i++) {
                        if(c3[i] != 0){
                            c1[0] = c3[i];
                            c3[i] = 0;
                            Arrays.sort(c1);
                            break;
                        }
                    }
                }
                System.out.println(" ");
                System.out.println("C1:");

                for(int i :  c1){
                    System.out.print(i + ",");
                }
                System.out.println(" ");
                System.out.println("C2:");

                for(int i :  c2){
                    System.out.print(i + ",");
                }
                System.out.println(" ");
                System.out.println("C3:");
                for(int i : c3){
                    System.out.print(i+",");
                }
                x++;
                if(x == minmoves){
                    System.exit(0);
                }
                //pt2
                int s2c = 0;
                int s2c2 = 0;
                for (int i = 0; i < c1.length; i++) {
                    if(c1[i] != 0){

                        s2c = c1[i];
                        break;
                    }
                }
                for (int i = 0; i < c2.length; i++) {
                    if(c2[i] != 0){
                        s2c2 = c2[i];
                        break;
                    }
                }
                System.out.println(" ");
                if ((s2c < s2c2 || s2c2 == 0) && s2c != 0){
                    System.out.println("Move a disk from the 1st to 2nd");
                    for (int i = 0; i < c1.length; i++) {
                        if(c1[i] != 0){
                            c2[0] = c1[i];
                            c1[i] = 0;
                            Arrays.sort(c2);
                            break;
                        }
                    }
                }
                else{
                    System.out.println("Move a disk from the 2nd to 1st");
                    for (int i = 0; i < c2.length; i++) {
                        if(c2[i] != 0){
                            c1[0] = c2[i];
                            c2[i] = 0;
                            Arrays.sort(c1);
                            break;
                        }
                    }
                }
                System.out.println("C1:");

                for(int i :  c1){
                    System.out.print(i + ",");
                }
                System.out.println(" ");
                System.out.println("C2:");

                for(int i :  c2){
                    System.out.print(i + ",");
                }
                System.out.println(" ");
                System.out.println("C3:");
                for(int i : c3){
                    System.out.print(i+",");
                }
                x++;
                if(x == minmoves){
                    System.exit(0);
                }
                //pt3
                int s3c = 0;
                int s3c2 = 0;
                for (int i = 0; i < c3.length; i++) {
                    if(c3[i] != 0){

                        s3c = c3[i];
                        break;
                    }
                }
                for (int i = 0; i < c2.length; i++) {
                    if(c2[i] != 0){
                        s3c2 = c2[i];
                        break;
                    }
                }
                System.out.println(" ");
                if ((s3c < s3c2 || s3c2 == 0 )&& s3c != 0){
                    System.out.println("Move a disk from the 3rd to 2nd");
                    for (int i = 0; i < c3.length; i++) {
                        if(c3[i] != 0){
                            c2[0] = c3[i];
                            c3[i] = 0;
                            Arrays.sort(c2);
                            break;
                        }
                    }
                }
                else{
                    System.out.println("Move a disk from the 2nd to 3rd");
                    for (int i = 0; i < c2.length; i++) {
                        if(c2[i] != 0){
                            c3[0] = c2[i];
                            c2[i] = 0;
                            Arrays.sort(c3);
                            break;
                        }
                    }
                }
                System.out.println(" ");
                System.out.println("C1:");

                for(int i :  c1){
                    System.out.print(i + ",");
                }
                System.out.println(" ");
                System.out.println("C2:");

                for(int i :  c2){
                    System.out.print(i + ",");
                }
                System.out.println(" ");
                System.out.println("C3:");
                for(int i : c3){
                    System.out.print(i+",");
                }
                x++;
                if(x == minmoves){
                    System.exit(0);
                }



            }
        }

        /*
        For an even number of disks:
make the legal move between pegs A and B (in either direction)
make the legal move between pegs A and C (in either direction)
make the legal move between pegs B and C (in either direction)
repeat until complete
         */

        /*
        For an odd number of disks:

make the legal move between pegs A and C (in either direction)
make the legal move between pegs A and B (in either direction)
make the legal move between pegs C and B (in either direction)
repeat until complete
         */

        //return dir;
    }
}

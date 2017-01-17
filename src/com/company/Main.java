package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        For an even number of disks:

make the legal move between pegs A and B (in either direction)
make the legal move between pegs A and C (in either direction)
make the legal move between pegs B and C (in either direction)
repeat until complete
For an odd number of disks:

make the legal move between pegs A and C (in either direction)
make the legal move between pegs A and B (in either direction)
make the legal move between pegs C and B (in either direction)
repeat until complete
         */
        System.out.println("How many disks?: ");
        Scanner input = new Scanner(System.in);
        move.disc(input.nextInt());

    }
}

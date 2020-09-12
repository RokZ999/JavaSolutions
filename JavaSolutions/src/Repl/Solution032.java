package Repl;

import java.util.Scanner;

public class Solution032 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int x = inp.nextInt();
	   	//write your code below
	     int f1 = 0;
	     int f2 = 1;
	     int all=0;
	     for ( int y=1;y<=x;y++) {
	       
	    	 System.out.print(all  +" ");
	         f1 =  f2 ; //1,2 
	         f2 = all; // 2, 3
	         all = f2+f1;  // 2, 3
	    
	 }
	     inp.close();
	}
}
package Repl;

import java.util.Scanner;

public class Solution019 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int end = inp.nextInt();
	    //write your code below
	    if (end >0)
	    for ( int l = 1;l<=end;l++)
	      System.out.print(l);
	  inp.close();
	  }
}
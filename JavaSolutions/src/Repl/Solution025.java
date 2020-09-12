package Repl;

import java.util.Scanner;

public class Solution025 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int x = inp.nextInt();
	    //write your code below
	    for (int j = 0 ;j<x; j++ ){
	      
	      System.out.print(j+" ");
	    }
	    inp.close();
	  }
}
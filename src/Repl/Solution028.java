package Repl;

import java.util.Scanner;

public class Solution028 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int x = inp.nextInt();
	    //write your code below
	    String besedilo = "AP CS A";
	    for(int k = 0;k<x;k++, System.out.println(besedilo));
	    inp.close();
	    
	  }
}
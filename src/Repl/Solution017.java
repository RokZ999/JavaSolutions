package Repl;

import java.util.Scanner;

public class Solution017 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String name = inp.nextLine();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	  	
	  	    if (name.equals("Chen")) {
	  	      System.out.print("teacher");
	  	    }
	  	    else {
	  	       System.out.print("student");
	  	    }
	  	inp.close();
		
	}
}
package Repl;

import java.util.Scanner;

public class Solution011 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String str = inp.nextLine();
	  	System.out.print("Start:");
	  	int start = inp.nextInt();
	  	System.out.print("End:");
	  	int end = inp.nextInt();
	    // Don't change the code above! Write your code below
	    System.out.printf("The substring of %s from %d to %d inclusive is %s%n", str, start, end, str.substring(start, end+1));
	    inp.close();
	}
}
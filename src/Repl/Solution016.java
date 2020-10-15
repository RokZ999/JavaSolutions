package Repl;

import java.util.Scanner;

public class Solution016 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	int num = inp.nextInt();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	    	if (!(num%2==0)) {
	    	  System.out.print(num +" is odd");
	    	}
	    	else{
	    	   System.out.print(num +" is even");
	    	}
	    inp.close();
	}
}
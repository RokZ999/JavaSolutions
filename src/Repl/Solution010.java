package Repl;

import java.util.Scanner;

public class Solution010 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String str = inp.nextLine();
	  	System.out.printf("The first 3 letters of %s is %s", str, str.substring(0, 3));
	  	inp.close();
	}
}
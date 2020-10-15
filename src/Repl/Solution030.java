package Repl;

import java.util.Scanner;

public class Solution030 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    //write your code below
	    int length = s.length();
	    for (int m=length-1;m>=0;System.out.print(s.charAt(m) + " "), m--);
	    inp.close();
	  }
}
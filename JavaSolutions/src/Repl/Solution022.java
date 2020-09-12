package Repl;

import java.util.Scanner;

public class Solution022 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    
	    for (int j = 0;j<word.length();j+=2)
	      System.out.println(word.charAt(j));
	    inp.close();
	}
}
package Repl;
import java.util.Scanner;

public class Solution021 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	 
	    for (int j = 0;j<word.length();j++) 
	      System.out.println(word.charAt(j));
	    
	    inp.close();
	    
	  }
}
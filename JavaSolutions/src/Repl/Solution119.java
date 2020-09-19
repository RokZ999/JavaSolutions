package Repl;

import java.util.Scanner;

public class Solution119 {
	
	
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("# in:");
	    int amt = inp.nextInt();
	    inp.nextLine(); //this line is necessary
	    System.out.print("word:");
	    printCorrect(inp.next());
	    //leave the above unedited, write your code below:
	  }
	
	static void printCorrect(String word)
	{
		
	    String word2l=word.substring(word.length()-2,word.length()), word1l = ""+ word.charAt(word.length()-1);
		
		if(word2l.equals("fe"))
		    System.out.println(word);	
		
	}
}
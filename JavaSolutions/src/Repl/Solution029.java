package Repl;

import java.util.Scanner;


public class Solution029 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    //write your code below
	   
	   char index[] = s.toCharArray();
	   for (char symbol : index ) System.out.print(symbol + " ");
	   
	   
	   /*Loop solution 
	    for (int x = 0;x<s.length();System.out.print(s.charAt(x)+ " "), x++);
	    */
	   inp.close();
	   
	  }
}
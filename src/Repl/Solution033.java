package Repl;

import java.util.Scanner;

public class Solution033 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String str = inp.nextLine();
	   	//write your code below
	   	  String reverse="";
	   	  int dolzina = str.length()-1;
	   	for (int x=dolzina;x>=0;reverse += str.substring(x, x+1),x-- );
	   	str=str.replaceAll("\\s","");
	   	reverse=reverse.replaceAll("\\s","");
	   	if (reverse.equalsIgnoreCase(str)) System.out.print("true"); //Palindrome
	   	else System.out.print("false"); 
	   	inp.close();
	  }
}
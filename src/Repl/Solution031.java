package Repl;

import java.util.Scanner;

public class Solution031 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    //write your code below
	    int length = s.length();//dolzina
	    char letters[] = new char[length];//stevilo koliko jih je
	    for(int i = 0;i<length;i++){
	      
	 
	      if (i%2 == 0) letters[i] = s.substring(i,i+1).toLowerCase().toCharArray()[0];
	     else letters[i] = s.substring(i,i+1).toUpperCase().toCharArray()[0];
	      
	    }
	    s = String.valueOf(letters);
	    System.out.print(s);
	    inp.close();
	  }
}
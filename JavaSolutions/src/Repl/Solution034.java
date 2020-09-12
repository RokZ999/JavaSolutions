package Repl;

import java.util.Scanner;

public class Solution034 {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print("#1: ");
	    int num1 = s.nextInt();
	    System.out.print("#2: ");
	    int num2 = s.nextInt();
	    //start on line 11
	    for ( int j = num1; j<=num2;j++){
	      
	      if (!(j%2==0)) System.out.print( j + " ");
	      
	    }
	    
	  s.close();
	  }
}
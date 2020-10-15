package Repl;

import java.util.Scanner;

public class Solution035 {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print("#1: ");
	    int num1 = s.nextInt();
	    System.out.print("#2: ");
	    int num2 = s.nextInt();
	  
	    int copy=0;
	      for ( int j = num1; j<=num2;j++){
	      
	      if (!(j%2==0)){
	 
	        copy +=j ;
	      }
	      
	    }
	    System.out.print(copy + " ");
	    s.close();
	  }
}
package Repl;

import java.util.Scanner;

public class Solution027 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int x = inp.nextInt();
	    //write your code below
	     for(int i=x;i>0;i--,System.out.print(i+" "));
	    inp.close();
	  }
}
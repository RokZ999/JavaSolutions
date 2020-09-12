package Repl;

import java.util.Scanner;

public class Solution015 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	int num = inp.nextInt();
	  	if(num != 0)
	  		System.out.printf("%d is %s%n",num,num<0 ? "negative" : "positive");
	  	inp.close();
	}
}
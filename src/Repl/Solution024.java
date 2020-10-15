package Repl;

import java.util.Scanner;

public class Solution024 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    double max = inp.nextDouble();
	    System.out.printf( isPrime(max) ? "prime" : "not prime");
	    inp.close();
	}
	
	public static boolean isPrime(double max) {
		if (max==0) return false;
		for(int i=2;i<max;i++)
			if(max%i==0) return false;
		return true;
	}
}
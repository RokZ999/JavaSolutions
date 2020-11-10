package Eruler;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eruler003 {
	
	
	public static void main(String[] args) {
		long inp=0;
		Scanner in = new Scanner(System.in);
		System.out.println("What is the largest prime factor of the number 600851475143 ?");
		System.out.print("Input: ");
		
		inp = in.nextLong();
		in.close();
		
		System.out.println(factor(inp));
	
		
	}
	public static long factor(long rc) {

		   long n = rc;

		   List<Long> pfactors = new ArrayList<Long>();

		    for (long i = 2 ; i <= n ;  i++) {
		    	System.out.printf("%d mod %d == 0, %b%n", n,i,n % i == 0);
		        while (n % i == 0) {
		        	
		            pfactors.add(i);

		            n = n / i;

		        }

		    }

		    return pfactors.get(pfactors.size() - 1);
		}
}

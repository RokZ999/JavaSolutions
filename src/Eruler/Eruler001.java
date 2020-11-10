package Eruler;

public class Eruler001 {
	public static void main(String[] args) {
		int n1=1,n2=2,k=0,sum=2;
		System.out.println("By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.");
		while(k<4_000_000) {
			k = n1+n2;
			n1=n2;
			n2=k;
			sum+= k%2==0 ? k : 0; 
		}
		System.out.println(sum);
		
	}
}

package Repl;

public class Solution047 {
	
	static int sumFivesRange(int a, int b)
	{
		int sum = 0;
		 while(a<=b) {
			 if(a%10==0 || a%10==5)
			 {
				 sum+=a;
				 a+=5;
			 }
			 else
				 a++;
		 }
		 return sum;
			 
	}
	public static void main(String[] args) {
		System.out.println(sumFivesRange(5,15)); //30
		System.out.println(sumFivesRange(11,28)); //60
	}
}
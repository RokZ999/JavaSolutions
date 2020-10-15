package Repl;

public class Solution045 {
	public static int sumToX (int x) 
	{
		int sum = 0;
		for (int j = 1;j<=x;sum+=j++);
		return sum;
	}
	
	//test case below (dont change):
	public static void main(String[] args)
	{
		System.out.println(sumToX(5)); //15
		System.out.println(sumToX(7)); //28
	}
}
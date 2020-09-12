package Repl;

public class Solution046 {
	public static int sumEvenToXR(int x)
	{
		return x==0 ? 0 : x%2==0 ? x+sumEvenToX(x-1) : sumEvenToX(x-1);
	}
	
	public static int sumEvenToX(int x)
	{
		int sum=0;
		for(int i= x%2==0 ? x :x-1;i>1;i-=2)
			sum+=i;
		return sum;
	}
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(sumEvenToX(5)); //6
		System.out.println(sumEvenToX(8)); //20
	}
}
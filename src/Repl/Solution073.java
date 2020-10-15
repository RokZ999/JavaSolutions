package Repl;

public class Solution073 {
	public static int sumElements(int[] array)
	{
		for(int i=1;i<array.length;array[0]+=array[i++]);
		return array[0];
	}
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		System.out.println(sumElements(a)); //should print 15
	}
}
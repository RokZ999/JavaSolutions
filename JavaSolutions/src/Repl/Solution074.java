package Repl;

public class Solution074 {
	public static void main(String[] args)
	{
		int[] a = {2,7,3,8,4};
		System.out.println(avgElements(a)); //should print 4.8
	}
	public static double avgElements(int[] array)
	{
		return (double) sumElements(array)/array.length;
	}
	public static int sumElements(int[] array)
	{
		for(int i=1;i<array.length;array[0]+=array[i++]);
		return array[0];
	}
}
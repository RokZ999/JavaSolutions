package Repl;

import java.util.Arrays;

public class Solution071 {

	public static double[] timesTen(double[] arr)
	{
			for(int i=0;i<arr.length;arr[i]=arr[i++]*10);
			return arr;
	}
	

	public static void main(String[] args)
	{
		double[] arr = {10.0,20.0,30.0,40.0,50.0};
		System.out.println(Arrays.toString(timesTen(arr)));
	}
}
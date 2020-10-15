package Repl;

import java.util.Scanner;

public class Solution079 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextInt();
		}
		//leave above alone!  write your code below
		System.out.print("{");
		for (int i=0;i<4;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[arr.length-1]+"}");
		input.close();
	}
}
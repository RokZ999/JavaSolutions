package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class Solution077 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextInt();
		}
		//leave above alone!  write your code below
		Arrays.stream(arr).forEach(i -> System.out.println(i));
		input.close();
	}
}
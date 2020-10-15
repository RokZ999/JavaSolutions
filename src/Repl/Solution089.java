package Repl;

import java.util.Arrays;

public class Solution089 {
	public static void main(String[] args)
	{
		int[][] a = {
			{1,2,3},
			{4,5,6},
			{1,3,5}
		};
		sub(a);
		System.out.println(Arrays.deepToString(a));
	}
	
	public static void sub(int[][] nums)
	{
		for(int i=0;i<nums.length;i++)
			for(int j=0;j<nums[i].length;j++)
				nums[i][j]-=10;
		
	}
}
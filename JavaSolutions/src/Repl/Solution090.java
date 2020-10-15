package Repl;

public class Solution090 {
	public static void main(String[] args)
	{
		int[][] a = {
			{14,20,3,2},
			{4,15,6,1},
			{12,31,4,16}
		};
		System.out.println(mystery(a,3,4)); //should print 5
		//prints array
		for(int[] row : a){
			for(int e : row){
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}
	
	public static int mystery(int[][] nums, int rows, int cols)
	{
		int odd=0;
		div(nums);
		for(int[] a:nums)
			for(int i:a)
				odd = i%2==1 ? odd+1 : odd;
		return odd;
	}
	public static void div(int[][] nums)
	{
		for(int i=0;i<nums.length;i++)
			for(int j=0;j<nums[i].length;j++)
				nums[i][j]/=3;
		
	}
}
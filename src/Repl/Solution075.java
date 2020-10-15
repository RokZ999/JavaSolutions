package Repl;

public class Solution075 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		mystery(a);
		for(int e : a)
		{
			System.out.print(e + " ");
		}
	}
	public static void mystery(int[] array)
	{
		for(int i=0;i<array.length;array[i] = array[i]%2==0 ? array[i]/2 : array[i]*10,i++);
	}
}
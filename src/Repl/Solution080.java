package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class Solution080 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextInt();
		}
		
		for(int i=0; i<arr.length/2; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length -i -1];
			arr[arr.length -i -1] = temp;
		  }
		  Arrays.stream(arr).forEach( i -> System.out.println(i));
		  input.close();
	}
}
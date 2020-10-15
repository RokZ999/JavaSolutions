package Repl;

import java.util.Scanner;

public class Solution076 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many names: ");
		String[] names = new String[in.nextInt()];
		in.nextLine();//WHITE SPACE REMOVER

		for(int i=0;i<names.length;i++){
			System.out.printf("Enter name for %d. candidate: ", i+1);
			names[i] = in.nextLine();
		}
		for(int i=0;i<names.length;i++){
			System.out.print(names[i].charAt(0));
		}
		in.close();
	}
}
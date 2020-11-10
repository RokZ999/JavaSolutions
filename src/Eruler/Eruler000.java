package Eruler;
import java.util.Scanner;

public class Eruler000 {
	public static void main(String[] args) {
		int sum = 0, inp = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Find the sum of all the multiples of 3 or 5 below 1000.");
		System.out.print("Input: ");
		inp = in.nextInt();
		for(int i=0;i<inp;sum+= i%3==0 || i%5==0 ? i : 0,i++);
		System.out.println(sum);
		in.close();
	}
}

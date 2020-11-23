package techtok7;

public class Solution000 {
	public static void main(String[] args) {
	
		printR(10);
		
	}
	
	static int printR(int n) {
		
		if(n<=1) return 1;
		int m = n-1;
		
		System.out.print(n*m + " ");	
		
		return printR(n-1);
		
		
	}
	
	static int series(int n) {
		series(n-1);
		return n>1 ? 1 : n;
	}
	
}
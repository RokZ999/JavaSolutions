package Repl;

public class Solution008 {
	public static void main(String[] args) {
		String str = "abracadabra alakazam";
	    String target1 = "dab";
	    String target2 = "ABRA";
	    
	    //write code here
	    System.out.printf("%d%n%d%n%d%n%d%n", str.indexOf("c"),str.indexOf(" "), str.indexOf(target1.charAt(0)),  str.indexOf(target2.charAt(0)) );
	}
}
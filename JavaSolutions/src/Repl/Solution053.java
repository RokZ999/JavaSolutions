package Repl;

public class Solution053 {
	
	public static String spaceOut(String s) {
		return s.replaceAll(".", "$0 ");
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(spaceOut("hello")); //"h e l l o "
		System.out.println(spaceOut("technology")); //"t e c h n o l o g y "
	}
}
package Repl;

public class Solution054 {
	public static String thirdLetter(String s) {
		String char3="";
		for(int i =0;i<s.length();i+=3) {
			if(s.charAt(i)==32) i++;
			char3+=s.charAt(i);
		}
		return char3;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(thirdLetter("hello there")); //"hltr"
		System.out.println(thirdLetter("technology")); //"thly"
	}
}
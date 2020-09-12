package Repl;

public class Solution057 {
	
	static String surroundStr(String s,String search_term) {
		return s.replaceAll(search_term, String.format("(%s)", search_term));
		
	}
	
	public static void main(String[] args){
		System.out.println(surroundStr("abcabcabc","abc")); //"(abc)(abc)(abc)"
		System.out.println(surroundStr("there, on planeth hoth","th")); //"(th)ere, on plane(th) ho(th)"
	}
}
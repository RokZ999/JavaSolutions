package Repl;

public class Solution056 {
	static String surround(String s,char search_term) {
		String edited = "";
		for(char ch : s.toCharArray())
			edited += ch==search_term ? String.format("(%c)", search_term) : ch;
		return edited;
		
	}
	
	
	//test case below (dont change):
		public static void main(String[] args){
			System.out.println(surround("abcabcabc",'c')); //"ab(c)ab(c)ab(c)"
			System.out.println(surround("technology",'o')); //"techn(o)l(o)gy"
		}
}
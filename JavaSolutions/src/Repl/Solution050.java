package Repl;

public class Solution050 {
	
	
	public static String keepVowels(String s)
	{
		String noVowels = "";
	
		for(int i=0;i<s.length();i++)
			noVowels += 
			s.charAt(i) == 'a' || 
			s.charAt(i) == 'e' || 
			s.charAt(i) == 'u' || 
			s.charAt(i) == 'i' || 
			s.charAt(i) == 'o' 
			? s.charAt(i): "";
		return noVowels;
	}
	
	public static void main(String[] args){
		System.out.println(keepVowels("hello")); //eo
		System.out.println(keepVowels("how do i internets")); //ooiiee
	}
	
}
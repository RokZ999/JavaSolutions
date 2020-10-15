package Repl;

public class Solution049 {
	
	
	public static int countVowels(String s)
	{
		int count = 0;
		for(int i=0;i<s.length();i++)
			count += 
			s.charAt(i) == 'a' || 
			s.charAt(i) == 'e' || 
			s.charAt(i) == 'u' || 
			s.charAt(i) == 'i' || 
			s.charAt(i) == 'o' 
			? 1 : 0;
		return count;
	}
	
	public static void main(String[] args){
		System.out.println(countVowels("obama")); //3
		System.out.println(countVowels("happy friday! i love weekends")); //9
	}
}
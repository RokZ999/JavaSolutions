package Repl;

public class Solution048 {
	
	
	public static int countAR(String s)
	{
		s = s.toLowerCase();
		return s.isEmpty() ? 0 : s.charAt(0) == 'a'  ? 1+countA(s.substring(0, s.length()-1)):1;
	}
	public static int countA(String s)
	{
		s = s.toLowerCase();
		int count = 0;
		for(int i=0;i<s.length();i++)
			count += s.charAt(i) == 'a' ? 1 : 0;
		return count;
	}
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countA("aaA")); //3
		System.out.println(countA("aaBBdf8k3AAadnklA")); //6
	}
}
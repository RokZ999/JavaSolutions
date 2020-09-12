package Repl;

public class Solution052 {
	
	static String alphabetical(String str)
	{
		String strAlpha = str.substring(0,1);
		for(int i=1;i<str.length();i++)
		{
			if(strAlpha.charAt(strAlpha.length()-1) < str.charAt(i)) {
				strAlpha += str.charAt(i);
			}
			else continue;
		}
		return strAlpha;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(alphabetical("adatplqzh")); //"adtz"
	}
}
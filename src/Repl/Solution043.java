package Repl;

public class Solution043 {
	public static String makeThreeSubstr(String word, int startIndex, int endIndex)
	{
	  String str = "";
	 for (int x = 0; x<3; x++) {
	    str+=word.substring(startIndex, endIndex);
	 }
	 return str;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(makeThreeSubstr("hello",0,2)); //should be hehehe
		System.out.println(makeThreeSubstr("shenanigans",3,7)); //should be naninaninani
	}
}
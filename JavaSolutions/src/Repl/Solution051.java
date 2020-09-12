package Repl;

public class Solution051 {
	
	public static int countString(String str, String toFind)
	{
		
		return  str.split(toFind, -1).length-1;
	}
	
	public static void main(String[] args){
		System.out.println(countString("crazy crayfish crushing craniums", "cra")); //3
		System.out.println(countString("sometimes solutions dont come on time", "me")); //4
	}
}
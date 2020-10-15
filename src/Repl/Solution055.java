package Repl;

public class Solution055 {
	static String censorLetter(String s,char ch) {
		return s.replace(ch, '*');
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(censorLetter("computer science",'e')); //"comput*r sci*nc*"
		System.out.println(censorLetter("trick or treat",'t')); //"*rick or *rea*"
	}
}
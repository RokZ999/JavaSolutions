package Repl;

public class Solution084 {
	public static void main(String[] args) {
		String[] arr = {"hey","yolo","hi","this is long"};
		System.out.println(maxLength(arr));



	}
	public static String maxLength(String[] words)
	{
		String bigWord = "";
		for(String str:words)
			bigWord = bigWord.length()<str.length() ? str:bigWord;
		return bigWord;
	}
}
package Repl;

public class Solution085 {
	public static void main(String[] args) 
	{
		String[] arr = {"hey","yolo","hi","this is long"};
		System.out.println(minVowels(arr));
		//should print "hi"
	}
	public static String minVowels(String[] words)
	{
		String word = words[0];
		for(int i=1;i<words.length;i++)
			word  = countVowels(word)==countVowels(words[i])  ? (word.length()<words[i].length() ? word : words[i]) : countVowels(word)> countVowels(words[i]) ? words[i] : word;
		return word;
	}
	public static int countVowels(String s)
	{
		int count = 0;
		for(char c:s.toCharArray())
			count = isVowel(c) ? count+1 : count;
		return count;
	}
	public static boolean isVowel(char ch)
	{
		return ch == 'a' ||
			   ch == 'e' ||
			   ch == 'i' ||
			   ch == 'o' ||
			   ch == 'u';
	}
}
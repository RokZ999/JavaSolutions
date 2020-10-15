package Repl;

import java.util.Arrays;

public class Solution072 {
	
	public static String[] combineNames(String[] first_names, String[] last_names)
	{
		for(int i=0;i<first_names.length;first_names[i]+=" " + last_names[i++]);
		return first_names;
	}
	public static void main(String[] args) {
		String[] first_names = {"bob","joe"};
		String[] last_names = {"jones","smith"};

		System.out.println(Arrays.toString(combineNames(first_names,last_names)));
	}
}
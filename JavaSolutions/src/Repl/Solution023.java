package Repl;

import java.util.ArrayList;
import java.util.Scanner;


public class Solution023 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    
	    char[] vowels = {'a', 'e', 'u', 'o', 'i' };
	    ArrayList<Character> list = new ArrayList<Character>();
	    for (char x : vowels) list.add(x);
	    
	    
	    for (int j = 0; j<word.length(); j++ ) {
	      if (list.contains(word.charAt(j))) {
	          System.out.print(word.charAt(j));        
	      }
	      
	    }
	    inp.close();
	    
	  }
}
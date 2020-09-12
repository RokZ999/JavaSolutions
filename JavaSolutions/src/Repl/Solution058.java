package Repl;

public class Solution058 {
	public static void main(String[] args)
	  {
		String output=null;
	    String text = "hello";
	    if ((text.indexOf(" ") == -1)) //if a space doesn't exist
	    {
	    	output = "one word";
	    }
	    else
	    {
	    	output = "more than one word";
	    }
	    System.out.println(output);
	  }
}
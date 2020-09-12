package Repl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		File solutions; 
		FileWriter lol;
		
		for(int i=6;i<125;i++) {
			
			solutions = new File("C:\\Users\\Administrator\\eclipse-workspace\\JavaSolutions\\src\\Repl\\Solution" + (i<10 ? "00"+i : i<100 ? "0"+i : i )+".java");
			
			lol = new FileWriter(solutions);
			lol.write("package Repl;\r\n" + 
					"\r\n" + 
					"public class Solution"+ (i<10 ? "00"+i : i<100 ? "0"+i : i )+ " {\r\n" + 
					"	public static void main(String[] args) {\r\n" + 
					"		String firstName=\"Bob\",lastName=\"Jones\";  \r\n" + 
					"	}\r\n" + 
					"}");
			lol.close();
		
		}
	}
}

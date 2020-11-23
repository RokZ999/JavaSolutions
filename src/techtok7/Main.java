package techtok7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		File solutions; 
		FileWriter lol;
		String user = System.getProperty("user.name");
	
		
		for(int i=0;i<125;i++) {
			
			solutions = new File("C:\\Users\\"+user + "\\eclipse-workspace\\JavaSolutions\\src\\techtok7\\Solution" + (i<10 ? "00"+i : i<100 ? "0"+i : i ) +".java");
			
			lol = new FileWriter(solutions);
			lol.write("package techtok7;\r\n" + 
					"\r\n" + 
					"public class Solution"+ (i<10 ? "00"+i : i<100 ? "0"+i : i )+ " {\r\n" + 
					"	public static void main(String[] args) {\r\n\n" +  
					"	}\r\n" + 
					"}");
			lol.close();
		
		}
	}
}

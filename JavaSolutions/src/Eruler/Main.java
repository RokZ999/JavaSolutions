package Eruler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		File solutions; 
		FileWriter lol;
		
		for(int i=0;i<750;i++) {
			
			solutions = new File("C:\\Users\\Administrator\\git\\repository\\JavaSolutions\\src\\Eruler\\" + i +".java");
			
			lol = new FileWriter(solutions);
			lol.write("package Eruler;\r\n" + 
					"import java.util.Scanner;\r\n" + 
					"\r\n" + 
					"public class Eruler"+i+" {\r\n" + 
					"	public static void main(String[] args) {\r\n" + 
					"		Scanner in = new Scanner(System.in);\r\n" + 
					"		System.out.print(\"Input: \");\r\n" + 
					"		\r\n" + 
					"		in.close();\r\n" + 
					"	}\r\n" + 
					"}\r\n" + 
					"");
			lol.close();
		
		}
	}
}

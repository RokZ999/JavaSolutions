package Repl;


public class Solution066 {
	public static void main(final String[] args) {
		final UAGStudent s1 = new UAGStudent("Muhammed",11);
		final UAGStudent s2 = new UAGStudent("Alan",11);
		final UAGStudent s3 = new UAGStudent("Sophie",11);
		System.out.printf("%s%n%s%n%s%n",s1,s2,s3);
	}
}
class UAGStudent{
	String name;
	int grade;
	static String principalName = "Ms. McKoy";
	String studentID;
	static int nextID = 100;

	public UAGStudent(final String name, final int grade) {
		this.name = name;
		this.grade = grade;
		studentID = "" + name.charAt(0) + ++nextID;
	}
	static void newPrincipal(String newName){
		principalName = newName;
	}

	static void resetID(){
	nextID=100;		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s%n", this.name,this.studentID);
	}		
	
}
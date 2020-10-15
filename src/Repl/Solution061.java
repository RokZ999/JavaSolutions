package Repl;

public class Solution061 {
	public static void main(String[] args)
  	{
    	Student hector = new Student("Hector",11,3.0,1,2,3);
    	System.out.println("Student Name: " + hector.name);
    	System.out.println("Student Grade: " + hector.grade);
    	System.out.println("Student GPA: " + hector.gpa);
    	
    	System.out.println("Changing GPA...");
    	hector.changeGPA(3.5);
    	
    	System.out.println("Student's New GPA: " + hector.gpa);
    	
    	System.out.println(hector);
    	
    	//uncomment the following when you've written the other tests
    	//you can uncomment by highlighting text and hitting CMD+/
    	
    	// System.out.println("Student graduated!");
    	// hector.graduate();
    	// System.out.println("Currently in grade: " + hector.grade);
    	
    	// hector.checkUniform(false);
    	// hector.checkUniform(false);
    	// hector.checkUniform(false);
    	// hector.checkUniform(false);
    	// System.out.println(hector.name + " went a few days without uniform..");
    	// System.out.println(hector.daysWithoutUniform + " days, to be exact.");
    	
    	// System.out.println("He/she is wearing his/her uniform today!");
    	// hector.checkUniform(true);
    	// System.out.println("Current days without uniform for " + hector.name + ": " + hector.daysWithoutUniform);
  	}
}
class Student
{
	//class variables/states
	public String name;
	public int grade;
	public double gpa;
	public int daysWithoutUniform;
    public int r=0,g=0,b=0;
	
	//constructor
	public Student(String aname, int agrade, double agpam, int r, int g, int b)
	{
		this.name = aname;
		this.grade = agrade;
		this.gpa = agpam;
		this.daysWithoutUniform = 0;
	}
	
	//methods/behaviors
	public void changeGPA(double new_gpa)
	{
		this.gpa = new_gpa;
	}
	public void changeName(String new_name)
	{
	   this.name = new_name;
	}
	public void graduate(int grade)
	{
	   this.grade++;
	}
	public void checkUniform(boolean isWearingUniform)
	{
	  if(isWearingUniform)
	    daysWithoutUniform=0;
	  else
	    daysWithoutUniform++;
	}
	public void r(int howManyR)
	{
	  this.r = howManyR;
	}
	public void g(int howManyG)
	{
	  this.g = howManyG;
	}
	public void b(int howManyB)
	{
	  this.b = howManyB;
	}
	@Override
	public String toString() {
		return "Hello";
	}
}
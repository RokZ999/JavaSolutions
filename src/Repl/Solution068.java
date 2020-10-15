package Repl;

public class Solution068 {
	public static void main(String[] args) {
		
	}
}
class Person
{
	private String firstname;
	private String lastname;
	@SuppressWarnings("unused")
	private int birthmonth;
	@SuppressWarnings("unused")
	private int birthday;
	@SuppressWarnings("unused")
	private int birthyear;
	
	private String ssn;

	public Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthmonth = birthmonth;
		this.birthday = birthday;
		this.birthyear = birthyear;
		this.ssn = ssn;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBirthday(int birthmonth,int birthday, int birthyear){
		return String.format("%d/%d/%d",birthmonth,birthday,birthyear);
	}

	public boolean verifySSN(String ssn)
	{
		return ssn==this.ssn;
	}


}
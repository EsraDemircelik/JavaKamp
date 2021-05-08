
public class Instructor extends User{
	
	private String instructorNumber;
	
	public Instructor(int id, String firstName, String lastName, String userNumber,String instructorNumber) {
		super(id, firstName, lastName, userNumber);
		this.instructorNumber=instructorNumber;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}
	public void setInstructorNumber(String instructorNumber) {
		instructorNumber = instructorNumber;
	}

}

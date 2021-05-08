
public class Student extends User{
	
	private String studentNumber;
	private String sinif;
	
	public Student(int id, String firstName, String lastName, String userNumber, String studentNumber, String sinif) {
		super(id, firstName, lastName, userNumber);
		this.studentNumber = studentNumber;
		this.sinif = sinif;
	}

	public String getSinif() {
		return sinif;
	}
	public void setSinif(String sinif) {
		this.sinif = sinif;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}

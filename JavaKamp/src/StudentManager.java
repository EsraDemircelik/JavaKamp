
public class StudentManager{
	public void add(Student student) {
		System.out.println(student.getStudentNumber() + " numaralı" + student.getFirstName()+  " eklendi.");
		
	}
	public void delete(Student student) {
		System.out.println(student.getStudentNumber() + " numaralı" + student.getFirstName()+ " silindi");
		
	}
	

}


public class InstructorManager{
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorNumber()+" numaralý " + instructor.getFirstName()+ " eklendi");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.getInstructorNumber()+ " numaralý " + instructor.getFirstName()+ " silindi");
	}
	
	
}

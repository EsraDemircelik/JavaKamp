
public class InstructorManager{
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorNumber()+" numaral� " + instructor.getFirstName()+ " eklendi");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.getInstructorNumber()+ " numaral� " + instructor.getFirstName()+ " silindi");
	}
	
	
}

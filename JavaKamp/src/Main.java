
public class Main {

	public static void main(String[] args) {
		
		User user = new User(2, "20","Ayşe","Kaya");
		UserManager userManager= new UserManager();
		userManager.add(user);
		userManager.delete(user);
		
		Student student = new Student(1, "Kaya","Ayşe","1234","11", "100");
		StudentManager studentManager= new StudentManager();
		studentManager.add(student);
		studentManager.delete(student);
		
		Instructor instructor= new Instructor(2, "Ali","Demir","12","200");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		
		
	}

}


public class Main {
	public static void main(String[] args) {

		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setUserName("yavuzos");
		instructor.setMail("yavuz000000@gmail.com");
		instructor.setPassword("147569art");
		instructor.setFirstName("yavuz");
		instructor.setLastName("korkmaz");
		instructor.setAbout("yaz�l�mc� android developer");

		Student student = new Student();
		student.setId(2);
		student.setUserName("alizos");
		student.setMail("ali�o2234@gmail.com");
		student.setPassword("123asd456");
		student.setFirstName("ali");
		student.setLastName("�a�maz");

		// user manager
		UserManager userManager = new UserManager();
		userManager.add(student); // kullan�c� sisteme eklendi : a2
		userManager.add(instructor); // kullan�c� sisteme eklendi : y1
		userManager.signIn(student);
		userManager.signOut(instructor);

		System.out.println("----------------------");

		User[] users = { instructor, student };

		userManager.addMultiple(users);// bulk insert

		// instructor manager
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.about(instructor);
		instructorManager.assigment(instructor);
		instructorManager.addCourse(instructor);

		// student manager
		StudentManager studentManager = new StudentManager();
		studentManager.assigment(student);
		studentManager.join(student);

	}

}


public class InstructorManager extends UserManager {
	public void about(Instructor instructor) {
		System.out.println("E�itmen Hakk�nda --->" + instructor.getAbout());
	}

	public void addCourse(Instructor instructor) {
		System.out.println("kurs eklenmi�tir" + " " + "ekleyen : " + " " + instructor.getFirstName() + " "
				+ instructor.getLastName());
	}

	public void assigment(Instructor instructor) {
		System.out.println("�dev Atand� : " + instructor.getFirstName() + " " + instructor.getLastName());
	}

}

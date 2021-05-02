
public class InstructorManager extends UserManager {
	public void about(Instructor instructor) {
		System.out.println("Eðitmen Hakkýnda --->" + instructor.getAbout());
	}

	public void addCourse(Instructor instructor) {
		System.out.println("kurs eklenmiþtir" + " " + "ekleyen : " + " " + instructor.getFirstName() + " "
				+ instructor.getLastName());
	}

	public void assigment(Instructor instructor) {
		System.out.println("Ödev Atandý : " + instructor.getFirstName() + " " + instructor.getLastName());
	}

}

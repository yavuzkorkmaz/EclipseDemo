
public class StudentManager extends UserManager {
	public void join(Student student) {
		System.out.println("kursa kay�t olundu" + " " + student.getUserNumber());
	}

	public void assigment(Student student) {
		System.out
				.println("�dev Yolland� " + "�devi Yollayan : " + student.getFirstName() + " " + student.getLastName());
	}

}
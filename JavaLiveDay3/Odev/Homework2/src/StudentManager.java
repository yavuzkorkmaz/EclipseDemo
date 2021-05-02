
public class StudentManager extends UserManager {
	public void join(Student student) {
		System.out.println("kursa kayıt olundu" + " " + student.getUserNumber());
	}

	public void assigment(Student student) {
		System.out
				.println("Ödev Yollandı " + "Ödevi Yollayan : " + student.getFirstName() + " " + student.getLastName());
	}

}
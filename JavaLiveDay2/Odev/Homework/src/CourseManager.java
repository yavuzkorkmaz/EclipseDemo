
public class CourseManager {
	
	//kurs ekleme
	public void add(Course course) {
		System.out.println("kurs eklenmi�tir" + course.name);
	}
	
	//kurs silme
	public void delete(Course course) {
		System.out.println("kurs silinmi�tir"+course.name);
	}
	
	public void update(Course course) {
		System.out.println("kursunuz g�ncellenmi�tir"+course.name);
	}

}

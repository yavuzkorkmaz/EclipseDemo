
public class CourseManager {
	
	//kurs ekleme
	public void add(Course course) {
		System.out.println("kurs eklenmiþtir" + course.name);
	}
	
	//kurs silme
	public void delete(Course course) {
		System.out.println("kurs silinmiþtir"+course.name);
	}
	
	public void update(Course course) {
		System.out.println("kursunuz güncellenmiþtir"+course.name);
	}

}


public class CourseManager {
	
	//kurs ekleme
	public void add(Course course) {
		System.out.println("kurs eklenmiştir" + course.name);
	}
	
	//kurs silme
	public void delete(Course course) {
		System.out.println("kurs silinmiştir"+course.name);
	}
	
	public void update(Course course) {
		System.out.println("kursunuz güncellenmiştir"+course.name);
	}

}

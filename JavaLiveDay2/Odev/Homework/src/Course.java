
public class Course {
	
	public Course() {
		System.out.println("kurs çalýþmýþtýr");
	}
	
	public Course(int id,String name,String instructorFirstName,String instructorLastName,String details) {
		this.id=id;
		this.name=name;
		this.instructorFirstName=instructorFirstName;
		this.instructorLastName=instructorLastName;
		this.details=details;
	}
	
	int id;
	String name;
	String instructorFirstName;
	String instructorLastName;
	String details;
	
}

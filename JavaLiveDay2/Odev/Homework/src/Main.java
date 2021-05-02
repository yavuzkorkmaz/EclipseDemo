
public class Main {

	public static void main(String[] args) {
		
		//course class
		Course course1 = new Course(1,"Java Kursu","Engin","DEMÝROÐ","Java Kursudur");

		Course course2 = new Course(2,"c# Kursu","Ferhat","YILMAZ","c# öðrenin güzeldir");
		
		Course course3 = new Course(3,"Python Kursu","ali","DEMÝR","python öðrenin");
		
		Course[] courses = {course1,course2,course3};
		
		for(Course course : courses) {
			System.out.println("kurs adý : "+course.name + " "+ "eðitmen : "+course.instructorFirstName + " "+course.instructorLastName);
		}
		
		CourseManager coursemanager = new CourseManager();
		coursemanager.add(course1);
		coursemanager.delete(course2);
		
		//category class
		
		Category category1 = new Category(1,"kurslarýmýz","tüm kurslar burada");
		
		Category category2 = new Category(2,"SSS","Sýkça Sorulan Sorular");
		
		Category category3 = new Category(3,"Kampa Hazýrlýk","Kamptan En Ýyi Verimi Nasýl Alabilirim");
		
		Category[] categories = {category1,category2,category3};
		
		for(int i =0;i<categories.length;i++) {
			System.out.println("kategori barý : "+categories[i].title);
		}
		
		//category methods
		
		CategoryManager categorymanager = new CategoryManager();
		categorymanager.add(category1);
		categorymanager.delete(category2);
		categorymanager.update(category3);
		
	

	}

}

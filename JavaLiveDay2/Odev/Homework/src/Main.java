
public class Main {

	public static void main(String[] args) {
		
		//course class
		Course course1 = new Course(1,"Java Kursu","Engin","DEM�RO�","Java Kursudur");

		Course course2 = new Course(2,"c# Kursu","Ferhat","YILMAZ","c# ��renin g�zeldir");
		
		Course course3 = new Course(3,"Python Kursu","ali","DEM�R","python ��renin");
		
		Course[] courses = {course1,course2,course3};
		
		for(Course course : courses) {
			System.out.println("kurs ad� : "+course.name + " "+ "e�itmen : "+course.instructorFirstName + " "+course.instructorLastName);
		}
		
		CourseManager coursemanager = new CourseManager();
		coursemanager.add(course1);
		coursemanager.delete(course2);
		
		//category class
		
		Category category1 = new Category(1,"kurslar�m�z","t�m kurslar burada");
		
		Category category2 = new Category(2,"SSS","S�k�a Sorulan Sorular");
		
		Category category3 = new Category(3,"Kampa Haz�rl�k","Kamptan En �yi Verimi Nas�l Alabilirim");
		
		Category[] categories = {category1,category2,category3};
		
		for(int i =0;i<categories.length;i++) {
			System.out.println("kategori bar� : "+categories[i].title);
		}
		
		//category methods
		
		CategoryManager categorymanager = new CategoryManager();
		categorymanager.add(category1);
		categorymanager.delete(category2);
		categorymanager.update(category3);
		
	

	}

}

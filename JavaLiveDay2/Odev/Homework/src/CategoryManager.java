
public class CategoryManager {
	public void add(Category category) {
		System.out.println("kategori eklenmi�tir : "+category.title);
	}
	
	public void delete(Category category) {
		System.out.println("kategori silinmi�tir : "+category.title);
	}
	
	public void update(Category category) {
		System.out.println("kategori g�ncellendi : "+category.title);
	}

}

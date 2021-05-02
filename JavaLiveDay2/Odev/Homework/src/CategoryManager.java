
public class CategoryManager {
	public void add(Category category) {
		System.out.println("kategori eklenmiþtir : "+category.title);
	}
	
	public void delete(Category category) {
		System.out.println("kategori silinmiþtir : "+category.title);
	}
	
	public void update(Category category) {
		System.out.println("kategori güncellendi : "+category.title);
	}

}

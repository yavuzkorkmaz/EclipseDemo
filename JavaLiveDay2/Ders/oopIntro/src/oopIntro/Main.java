package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo v14","16 GB Ram",15000);
		//product1.id=1;
		//product1.name="lenovo v14";
		//product1.detail="16 GB Ram";
		//product1.unitPrice=15000;
		
		Product product2 = new Product();
		product2.id=2;
		product2.name="lenovo v15";
		product2.detail="32 GB Ram";
		product2.unitPrice=18000;
		
		Product product3 = new Product();
		product3.id=3;
		product3.name="Hp 5";
		product3.detail="8 GB Ram";
		product3.unitPrice=12000;
		
		Product[] products = {product1,product2,product3};
		
		for(Product product : products) {
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Ev/Bahçe";
		
		ProductManager productmanager = new ProductManager();
		productmanager.addToCart(product3);
		
		productmanager.addToCart(product2);
		
		productmanager.addToCart(product1); //istediðin kadar kullanabilir düzenlemek istersen classa gidip rahatça düzeltebilirsin 
		
		//ders sonu
		
		
		
		

		
		

		
	}

}

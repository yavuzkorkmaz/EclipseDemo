package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAcces.abstracts.ProductDal;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDal productdal;
	private LoggerService loggerService;

	
	public ProductManager(ProductDal productdal,LoggerService loggerService) {
		super();
		this.productdal = productdal;
		this.loggerService=loggerService;
	}




	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		this.productdal.add(product);
		this.loggerService.logToSystem("ürün eklendi"+product.getName());
	}

	
	

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

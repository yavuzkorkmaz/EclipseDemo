package nLayeredDemo.dataAcces.concretes;

import java.util.List;

import nLayeredDemo.dataAcces.abstracts.ProductDal;
import nLayeredDemo.entities.concretes.Product;

public class AbcProductDal implements ProductDal{

	@Override
	public void add(Product product) {
		System.out.println("ABC ile yýkandý : "+product.getName());
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

package nLayeredDemo.dataAcces.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDal {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id); 
	List<Product> getAll();
}

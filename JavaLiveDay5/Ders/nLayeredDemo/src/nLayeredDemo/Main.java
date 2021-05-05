package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAcces.concretes.AbcProductDal;
import nLayeredDemo.dataAcces.concretes.HibernateProductDal;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: Spring IoC ile ��z�lecek  
		ProductService productService = new ProductManager(new AbcProductDal(),new JLoggerManagerAdapter());
		
		
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
		
		
	}

}

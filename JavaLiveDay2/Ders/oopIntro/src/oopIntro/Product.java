package oopIntro;

public class Product {  //bu Class �zellik tutuyor
	
	public Product() { //constructor 
		System.out.println("Ben �al��t�m.");
	}
	
	public Product(int id,String name,String detail,double unitPrice) {
		this();
		this.id=id;
		this.name=name;
		this.detail=detail;
		this.unitPrice=unitPrice;
	}
	
	
	int id;
	String name;
	double unitPrice;
	String detail;
	

}

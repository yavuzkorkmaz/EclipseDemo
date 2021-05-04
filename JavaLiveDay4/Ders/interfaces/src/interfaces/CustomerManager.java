package interfaces;

public class CustomerManager {
	//loosly - tightly coupled 
	
	private Logger[] loggers;
	
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("m��teri eklendis"+" "+customer.getFirstName());		
		
		Utils.RunLoggers(loggers,customer.getFirstName()); //static �ok kullan�l�yosa kullan gereksiz belle kyer
		
		

	}
	
	public void delete(Customer customer) {
		System.out.println("m��teri silindi"+" "+customer.getFirstName());

		Utils.RunLoggers(loggers,customer.getFirstName());



	}

}

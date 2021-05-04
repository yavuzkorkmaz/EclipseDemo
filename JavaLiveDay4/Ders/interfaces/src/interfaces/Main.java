package interfaces;

public class Main {

	public static void main(String[] args) {
						
		Logger[] loggers = {new EmailLooger(),new DatabaseLogger(),new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers); //interfacelerin newlenememe durumu burda geçerli
				
		Customer engin = new Customer(1,"Engin","Demiroð");
		customerManager.add(engin);
		
		

	}

}

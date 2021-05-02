package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber="12345";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber="789";
		
		SendikaCustomer sendika = new SendikaCustomer();
		sendika.customerNumber="359";
		
		CustomerManager customerManager = new CustomerManager();
		//customermanager.add(hepsiBurada);
		//customermanager.add(engin);
	    //customermanager.add(sendika);
		
		Customer[] customers = {engin,sendika,hepsiBurada};
		customerManager.addMultiple(customers);
	
	
	
	}

}

package interfaces;

public class SmsLogger implements Logger{ //logger � sms logger a uyarla

	@Override
	public void log(String message) {
		System.out.println("Sms G�nderildi");
		
	} 
	

}

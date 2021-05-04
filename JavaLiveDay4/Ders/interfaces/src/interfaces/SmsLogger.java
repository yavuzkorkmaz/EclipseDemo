package interfaces;

public class SmsLogger implements Logger{ //logger ý sms logger a uyarla

	@Override
	public void log(String message) {
		System.out.println("Sms Gönderildi");
		
	} 
	

}

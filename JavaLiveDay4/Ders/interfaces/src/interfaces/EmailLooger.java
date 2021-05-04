package interfaces;

public class EmailLooger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("E Maile Loglandý"+message);
		
	}
	
}

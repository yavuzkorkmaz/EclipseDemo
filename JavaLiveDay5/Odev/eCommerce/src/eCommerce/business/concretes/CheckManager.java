package eCommerce.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.CheckService;


public class CheckManager implements CheckService{

	@Override
	public boolean passwordCheck(String password) {
		if(password.length()<6) {
			System.out.println("þifreniz 6 haneden fazla olmalý");
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean eMailCheck(String mail) {
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        
        if(matcher.matches()) {
        	return true;
        }else if(mail.isEmpty()) {
        	System.out.println("e mail giriniz");
        	return false;
        }else {
        	System.out.println("geçersiz mail adresi");
        	return false;
        }

	}

	@Override
	public boolean firstNameCheck(String firstName) {
		if(firstName.length()<2) {
			System.out.println("isminiz 2 harfden fazla olmalý");
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean lastNameCheck(String lastName) {
		if(lastName.length()<2) {
			System.out.println("soyadýnýz 2 harfden fazla olmalý");
			return false;
		}else {
			return true;
		}
	}
	

}

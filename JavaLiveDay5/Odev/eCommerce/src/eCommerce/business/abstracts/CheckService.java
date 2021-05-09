package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface CheckService {
	boolean passwordCheck(String password);
	boolean eMailCheck(String mail);
	boolean firstNameCheck(String firstName);
	boolean lastNameCheck(String lastName);
	
}

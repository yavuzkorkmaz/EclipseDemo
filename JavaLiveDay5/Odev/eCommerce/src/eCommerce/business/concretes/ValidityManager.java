package eCommerce.business.concretes;

import eCommerce.business.abstracts.ValidityService;
import eCommerce.dataBase.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class ValidityManager implements ValidityService{

	UserDao userDao;
	
	public ValidityManager() {}
	
	public ValidityManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	
	@Override
	public boolean isValid(String mail) {
		for (User user : userDao.getAll()) {
			if(mail.equals(user.getEMail())) {
				System.out.println("Bu Email Zaten Sisteme Kayýtlý Lütfen Baþka Mail Giriniz");
				return false;
			}
		}
		return true;
	}

}

package eCommerce;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.CheckManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.business.concretes.ValidityManager;
import eCommerce.dataBase.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {
	User user1=new User(1, "yavuz", "selim", "yavuzslm@gmail.com", "1234567");
	UserService userService = new UserManager(new HibernateUserDao(),new CheckManager(),new ValidityManager());
	
	//userService.register(user1);
	

	
	

}

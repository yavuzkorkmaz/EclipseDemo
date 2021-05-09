package eCommerce.business.concretes;

import eCommerce.business.abstracts.CheckService;
import eCommerce.business.abstracts.UserService;
import eCommerce.business.abstracts.ValidityService;
import eCommerce.dataBase.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {

	UserDao userDao;
	CheckService checkService;
	ValidityService validityService;

	public UserManager(UserDao userDao, CheckService checkService, ValidityService validityService) {
		super();
		this.userDao = userDao;
		this.checkService = checkService;
		this.validityService = validityService;
	}

	@Override
	public void register(User user) {
		if (validityService.isValid(user.getEMail()) && checkService.firstNameCheck(user.getFirstName())
				&& checkService.eMailCheck(user.getEMail()) && checkService.lastNameCheck(user.getLastName())
				&& checkService.passwordCheck(user.getPassword())) {
			System.out.println(user.getEMail()+" "+"adresine doðrulama linki gönderilmiþtir lütfen linke týklayýnýz");
			userDao.register(user);
			System.out.println("----------------------------");

		}

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAccount(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void logIn(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void LogOut(User user) {
		// TODO Auto-generated method stub

	}

}
